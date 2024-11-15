// How does CERT coding rule applies to division operations? Provide a suitable code showing both  non-compliant // // and compliant versions  

/* The CERT (Computer Emergency Response Team) coding standards, specifically those related to division operations, are designed to prevent potential security vulnerabilities and runtime errors in software. When performing division operations, the CERT guidelines emphasize the following key points:

Key CERT Coding Rule for Division:
Division by Zero: The rule strongly discourages dividing by zero, as this results in a runtime exception (ArithmeticException in Java) or undefined behavior in some other languages. You should always ensure the divisor is non-zero before performing division.

Integer Overflow: In the case of integer division, there's a risk of integer overflow when dividing the minimum integer value (Integer.MIN_VALUE) by -1. This would lead to an overflow because the result exceeds the maximum positive integer (Integer.MAX_VALUE), which cannot be represented by an integer.

*/

//Non-Compliant Version (violates CERT rules):
public class DivisionExampleNonCompliant {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;  // Divisor is zero

        // Division operation that violates CERT rule: possible divide by zero
        int result = dividend / divisor;  // Throws ArithmeticException
        System.out.println("Result: " + result);
    }
}

/* Issues in the Non-Compliant Code:
Division by Zero: The divisor is set to 0, which will throw an ArithmeticException when the division operation is performed.*/