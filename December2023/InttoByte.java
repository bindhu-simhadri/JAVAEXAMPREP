/* Write and justify the output of the foll code */

class InttoByte {
    public static void main(String args[]) {
        byte b; 
        int i = 258;
        b = (byte)i;
        System.out.println(b);
    }
}

/*Initial Value Assignment:

An int variable i is assigned the value 258.
Casting from int to byte:

The line b = (byte)i; performs explicit type casting from int to byte.
The byte type in Java is an 8-bit signed integer, which can store values between -128 and 127 (inclusive).
The int type, however, can store much larger values (from -2^31 to 2^31-1).
Overflow Behavior:

When casting an int value to a byte, Java doesn't throw an error, but instead performs a modular arithmetic operation.
The actual value stored in b is the lower 8 bits of the integer i. This means Java effectively takes the result of i % 256 to get a byte value.
In this case, 258 % 256 = 2. Therefore, the int value 258 is truncated to 2 when cast to byte.
Output:

After the casting operation, the value stored in b will be 2.
The System.out.println(b); statement prints the value of b, which is 2. */

/* SAMPLE OUTOUT

2

  */

/* Justification:
The program casts the int value 258 to a byte. Since the byte can only hold values between -128 and 127, the integer value 258 is reduced to fit within this range.
This reduction is done by performing a modular operation (258 % 256 = 2). Therefore, the result of casting 258 to byte is 2, which is printed to the console.*/