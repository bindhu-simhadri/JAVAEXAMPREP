/* Write a Javafx application such that a user creates three text fields and enters "length", "breadth" and "color", where color can take values of red, green and blue. Create a push button with name "Render" on it. On clicking "Render" button, the application should render rectangle of the entered length, breadth and color using canvas. User GridPane layout. */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RectangleRenderer extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI components for length, breadth, and color input
        Label lengthLabel = new Label("Length:");
        TextField lengthField = new TextField();

        Label breadthLabel = new Label("Breadth:");
        TextField breadthField = new TextField();

        Label colorLabel = new Label("Color (red, green, blue):");
        TextField colorField = new TextField();

        Button renderButton = new Button("Render");

        // Create a Canvas for drawing the rectangle
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Set up event handling for the Render button
        renderButton.setOnAction(e -> {
            try {
                // Get length and breadth inputs and parse them to integers
                int length = Integer.parseInt(lengthField.getText());
                int breadth = Integer.parseInt(breadthField.getText());

                // Get the color input and determine the color
                String colorInput = colorField.getText().toLowerCase();
                Color color;
                switch (colorInput) {
                    case "red":
                        color = Color.RED;
                        break;
                    case "green":
                        color = Color.GREEN;
                        break;
                    case "blue":
                        color = Color.BLUE;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid color. Use red, green, or blue.");
                }

                // Clear the canvas and draw the rectangle with the given parameters
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(color);
                gc.fillRect(50, 50, length, breadth);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter valid numbers for length and breadth.");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        });

        // Set up the layout using GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add components to the GridPane
        gridPane.add(lengthLabel, 0, 0);
        gridPane.add(lengthField, 1, 0);

        gridPane.add(breadthLabel, 0, 1);
        gridPane.add(breadthField, 1, 1);

        gridPane.add(colorLabel, 0, 2);
        gridPane.add(colorField, 1, 2);

        gridPane.add(renderButton, 1, 3);
        gridPane.add(canvas, 0, 4, 2, 1);  // Span the canvas across 2 columns

        // Set up the Scene and Stage
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setTitle("Rectangle Renderer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
