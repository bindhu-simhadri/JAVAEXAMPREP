// Compliant Version (with CERT guidelines):
public class DivisionExampleCompliant {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 2;  // Non-zero divisor

        // Check for zero divisor before performing the division
        if (divisor != 0) {
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Handling Integer Overflow for division by Integer.MIN_VALUE
        int minValue = Integer.MIN_VALUE;
        int divisorForOverflow = -1;

        // Check for overflow when dividing Integer.MIN_VALUE by -1
        if (minValue == Integer.MIN_VALUE && divisorForOverflow == -1) {
            System.out.println("Error: Integer overflow when dividing Integer.MIN_VALUE by -1.");
        } else {
            int overflowSafeResult = minValue / divisorForOverflow;
            System.out.println("Safe result: " + overflowSafeResult);
        }
    }
}

/* Explanation of the Compliant Code:
Pre-Division Check for Zero:
Before performing any division, the code checks whether the divisor is zero. If it is zero, it prints an error message and avoids the division operation.
Integer Overflow Check:
Before performing a division operation that could potentially cause integer overflow (such as dividing Integer.MIN_VALUE by -1), the code explicitly checks for this condition and prints an appropriate error message instead of proceeding with the division.
The check if (minValue == Integer.MIN_VALUE && divisorForOverflow == -1) prevents the overflow scenario by detecting when the operation would result in a value larger than Integer.MAX_VALUE.*/

/* SAMPLE OUTPUT
  Result: 5
Error: Integer overflow when dividing Integer.MIN_VALUE by -1.
  */