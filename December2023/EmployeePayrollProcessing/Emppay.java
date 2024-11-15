/* Write a Java program to perform employee payroll processing using packages.
In the java file, Emp.java creates a package employee and creates a class Emp. 
Declare the variables name,empid, category, bpay, hra, da, npay, pf, grosspay, income tax, and allowance. Calculate the values in methods. 
Create another java file Emppay.java. Create an object e to call the methods to perform and print values    */

// Emppay.java (Main program that uses the Emp class)

// Import the employee package
import employee.Emp;

public class Emppay {
    public static void main(String[] args) {
        // Create an object of class Emp
        Emp e = new Emp("John Doe", "E123", "Manager", 60000); // Example employee

        // Calculate the payroll components
        e.calculateAllowance();   // Calculate allowances (10% of basic pay)
        e.calculateHRA();         // Calculate HRA (20% of basic pay)
        e.calculateDA();          // Calculate DA (15% of basic pay)
        e.calculateGrossPay();    // Calculate gross pay (sum of all allowances)
        e.calculateIncomeTax();   // Calculate income tax (10% if gross pay > 50000)
        e.calculatePF();          // Calculate Provident Fund (12% of basic pay)
        e.calculateNetPay();      // Calculate net pay (Gross - Tax - PF)

        // Display the payroll details for the employee
        e.displayPayroll();       // Display the calculated payroll details
    }
}



/* SAMPLE OUTPUT
Employee Name: John Doe
Employee ID: E123
Category: Manager
Basic Pay: 60000.0
House Rent Allowance (HRA): 12000.0
Dearness Allowance (DA): 9000.0
Allowance: 6000.0
Gross Pay: 87000.0
Income Tax: 8700.0
Provident Fund (PF): 7200.0
Net Pay: 73400.0

*/