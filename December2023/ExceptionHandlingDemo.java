/* Write a Java program that intentionally generates ArithmeticException and ArrayIndexOutOfBoundsException. 
Implement suitable code to handle these exceptions. Additionally, demonstrate when the "Unreachable catch block" error may arise and suggest how to address it   */

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        // Demonstrate ArithmeticException handling
        try {
            // Intentionally generate an ArithmeticException by dividing by zero
            int result = 10 / 0;  // Division by zero will cause an ArithmeticException
        } catch (ArithmeticException e) {
            // Handling the ArithmeticException
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }

        // Demonstrate ArrayIndexOutOfBoundsException handling
        try {
            // Intentionally generate an ArrayIndexOutOfBoundsException
            int[] numbers = new int[3];  // Array of size 3
            numbers[5] = 10;  // Accessing index 5 will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException caught: Index is out of bounds.");
        }

        // Demonstrate "Unreachable catch block" error
        try {
            // Intentionally throw a RuntimeException
            throw new NullPointerException();  // This exception will be caught in the first catch block
        } catch (RuntimeException e) {
            // Handling RuntimeException
            System.out.println("RuntimeException caught.");
        } catch (NullPointerException e) {
            // This block will never be reached since NullPointerException is a subclass of RuntimeException
            System.out.println("NullPointerException caught.");
        }

        // Solution for Unreachable catch block
        try {
            // Intentionally throw a NullPointerException
            throw new NullPointerException();
        } catch (NullPointerException e) {
            // Now it is reachable as we are catching NullPointerException specifically
            System.out.println("NullPointerException caught correctly.");
        } catch (RuntimeException e) {
            // This will be reached only for other RuntimeExceptions
            System.out.println("RuntimeException caught.");
        }
    }
}


/* SAMPLE OUTPUT
ArithmeticException caught: Division by zero is not allowed.
ArrayIndexOutOfBoundsException caught: Index is out of bounds.
RuntimeException caught.
NullPointerException caught correctly.

*/