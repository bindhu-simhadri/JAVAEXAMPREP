/*  Write a Java program to create a class known as Person with members FirstName, LastName and methods called getFirstName() and getLastName(). 
Create a subclass called Employee with members like empID and JobTitle, and a method named getEmployeeId() which overrides the getLastName() method to include the employee's job title.   */

// Base class Person
class Person {
    // Members for first name and last name
    protected String firstName;
    protected String lastName;

    // Constructor to initialize first name and last name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to get first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get last name
    public String getLastName() {
        return lastName;
    }
}

// Subclass Employee which extends Person
class Employee extends Person {
    // Members for employee ID and job title
    private String empID;
    private String jobTitle;

    // Constructor to initialize first name, last name, employee ID, and job title
    public Employee(String firstName, String lastName, String empID, String jobTitle) {
        super(firstName, lastName); // Call the constructor of the superclass (Person)
        this.empID = empID;
        this.jobTitle = jobTitle;
    }

    // Method to get employee ID
    public String getEmployeeId() {
        return empID;
    }

    // Override getLastName() to include the job title
    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class PersonAndEmployee {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person("John", "Doe");

        // Create an instance of Employee
        Employee employee = new Employee("Alice", "Smith", "E123", "Software Engineer");

        // Display the first name and last name for Person
        System.out.println("Person's First Name: " + person.getFirstName());
        System.out.println("Person's Last Name: " + person.getLastName());

        // Display the first name, last name with job title, and employee ID for Employee
        System.out.println("\nEmployee's First Name: " + employee.getFirstName());
        System.out.println("Employee's Last Name with Job Title: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}


/* SAMPLE OUTPUT
Person's First Name: John
Person's Last Name: Doe

Employee's First Name: Alice
Employee's Last Name with Job Title: Smith (Software Engineer)
Employee ID: E123
*/