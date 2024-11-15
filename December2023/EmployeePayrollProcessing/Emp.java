// Emp.java (Inside the employee package)

// Create a package called employee
package employee;

// Class Emp to store employee details and perform payroll calculations
public class Emp {
    // Declare member variables for employee details
    String name;
    String empid;
    String category;
    double bpay;       // Basic Pay
    double hra;        // House Rent Allowance
    double da;         // Dearness Allowance
    double npay;       // Net Pay
    double pf;         // Provident Fund
    double grosspay;   // Gross Pay
    double incometax;  // Income Tax
    double allowance;  // Other Allowances

    // Constructor to initialize employee details
    public Emp(String name, String empid, String category, double bpay) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
    }

    // Method to calculate HRA (House Rent Allowance)
    public void calculateHRA() {
        hra = bpay * 0.20;  // HRA is 20% of basic pay
    }

    // Method to calculate DA (Dearness Allowance)
    public void calculateDA() {
        da = bpay * 0.15;  // DA is 15% of basic pay
    }

    // Method to calculate Gross Pay
    public void calculateGrossPay() {
        grosspay = bpay + hra + da + allowance;
    }

    // Method to calculate Income Tax
    public void calculateIncomeTax() {
        if (grosspay > 50000) {
            incometax = grosspay * 0.10;  // 10% tax if gross pay > 50000
        } else {
            incometax = 0;
        }
    }

    // Method to calculate Provident Fund
    public void calculatePF() {
        pf = bpay * 0.12;  // PF is 12% of basic pay
    }

    // Method to calculate Net Pay
    public void calculateNetPay() {
        npay = grosspay - incometax - pf;  // Net Pay = Gross Pay - Tax - PF
    }

    // Method to calculate Allowances (other than HRA, DA, and PF)
    public void calculateAllowance() {
        allowance = bpay * 0.10;  // Allowance is 10% of basic pay
    }

    // Method to display the payroll information
    public void displayPayroll() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("House Rent Allowance (HRA): " + hra);
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("Allowance: " + allowance);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("Income Tax: " + incometax);
        System.out.println("Provident Fund (PF): " + pf);
        System.out.println("Net Pay: " + npay);
    }
}
