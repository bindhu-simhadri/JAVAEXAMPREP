/* Define two classes Car and Model 
class Car has a private variable carname and 
class Model has a  private variable Modelname. 
Write zero argument and parameterized constructors to initialize the data member and member functions to get, set  and display the data member for these classes. 
In the result class, write a merge() method which takes the 2 arguments as class Car and class Model objects and concatenates the data members of these two objects.
Write a main function that  creates instances of the classes Car and Model, assigns values to each and concatenates the value of data member of these objects using the merge() method . 
Display the objects before and after concatenation. */

// Class representing a Car with carname as a private variable
class Car {
  // Private variable for carname
  private String carname;

  // Zero-argument constructor
  public Car() {
    carname = "Unknown Car"; // Default value
  }

  // Parameterized constructor to initialize carname
  public Car(String carname) {
    this.carname = carname;
  }

  // Getter method for carname
  public String getCarname() {
    return carname;
  }

  // Setter method for carname
  public void setCarname(String carname) {
    this.carname = carname;
  }

  // Method to display carname
  public void displayCar() {
    System.out.println("Car Name: " + carname);
  }
}

// Class representing a Model with modelname as a private variable
class Model {
  // Private variable for modelname
  private String modelname;

  // Zero-argument constructor
  public Model() {
    modelname = "Unknown Model"; // Default value
  }

  // Parameterized constructor to initialize modelname
  public Model(String modelname) {
    this.modelname = modelname;
  }

  // Getter method for modelname
  public String getModelname() {
    return modelname;
  }

  // Setter method for modelname
  public void setModelname(String modelname) {
    this.modelname = modelname;
  }

  // Method to display modelname
  public void displayModel() {
    System.out.println("Model Name: " + modelname);
  }
}

// Class Result which contains the merge method
class Result {
  // Method to merge car and model names
  public void merge(Car car, Model model) {
    String merged = car.getCarname() + " " + model.getModelname();
    System.out.println("After Concatenation: " + merged);
  }
}

public class CarAndModelConcatenation {
  public static void main(String[] args) {
    // Create instances of Car and Model using parameterized constructors
    Car car = new Car("Toyota");
    Model model = new Model("Corolla");

    // Display the objects before concatenation
    System.out.println("Before Concatenation:");
    car.displayCar();
    model.displayModel();

    // Create Result object and call merge method
    Result result = new Result();
    result.merge(car, model); // Concatenate car and model names

    // Optionally display the car and model again after merging
    System.out.println("\nAfter Concatenation:");
    car.displayCar();
    model.displayModel();
  }
}

/*
 * SAMPLE OUTPUT
 * Before Concatenation:
 * Car Name: Toyota
 * Model Name: Corolla
 * After Concatenation: Toyota Corolla
 * 
 * After Concatenation:
 * Car Name: Toyota
 * Model Name: Corolla
 */