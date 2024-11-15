/* Write a Java Program to create a comboBox. The values for the comboBox are "Circle", "Rectangle", "Line". Based on the selection of the comboBox draw the shapes Circle, Rectangle or
Line on the window using Canvas*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShapeDrawer extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a ComboBox with shape options
        ComboBox<String> shapeComboBox = new ComboBox<>();
        shapeComboBox.getItems().addAll("Circle", "Rectangle", "Line");
        shapeComboBox.setValue("Circle");  // Set default value

        // Create a Canvas for drawing shapes
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Draw the default shape initially
        drawShape(gc, "Circle");

        // Set up event handling for the ComboBox selection
        shapeComboBox.setOnAction(e -> {
            String selectedShape = shapeComboBox.getValue();
            drawShape(gc, selectedShape);
        });

        // Set up the layout
        BorderPane root = new BorderPane();
        root.setTop(shapeComboBox);
        root.setCenter(canvas);

        // Set up the Scene and Stage
        Scene scene = new Scene(root, 400, 450);
        primaryStage.setTitle("Shape Drawer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to draw shapes based on the selected option
    private void drawShape(GraphicsContext gc, String shape) {
        // Clear the canvas
        gc.clearRect(0, 0, 400, 400);

        // Set a fill color for shapes
        gc.setFill(Color.LIGHTBLUE);
        gc.setStroke(Color.DARKBLUE);
        gc.setLineWidth(3);

        // Draw the selected shape
        switch (shape) {
            case "Circle":
                gc.fillOval(150, 100, 100, 100); // Draws a circle
                gc.strokeOval(150, 100, 100, 100); // Circle outline
                break;
            case "Rectangle":
                gc.fillRect(125, 100, 150, 100); // Draws a rectangle
                gc.strokeRect(125, 100, 150, 100); // Rectangle outline
                break;
            case "Line":
                gc.strokeLine(100, 200, 300, 200); // Draws a line
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
