/* What are the two generic restrictions that apply to arrays? Explain the restrictions with the help of a program.  */

/* In Java, there are two primary restrictions when dealing with generic arrays:

Cannot Create Arrays of Generic Types:
Java does not allow the direct creation of arrays of generic types because the JVM cannot fully determine the type of the array at runtime. This is mainly due to type erasure, where the generic type information is removed during compilation.

Type Safety Issues with Generics and Arrays:
While you can create an array of a specific type (like Integer[]), you cannot create an array of a generic type (like T[]), where T is a generic type parameter. This is because of the uncertainty at runtime regarding the actual type of the array.*/

import java.util.ArrayList;

public class GenericArrayExample {

    // A method that tries to create an array of a generic type
    public static <T> void createGenericArray() {
        // This will cause a compile-time error: 
        // Cannot create a generic array of type 'T[]'
        // T[] array = new T[10]; // Uncommenting this line will cause a compilation error

        // Instead, we can use an ArrayList to store generic types
        ArrayList<T> list = new ArrayList<>();
        System.out.println("Created an ArrayList of generic type.");
    }

    // A method that demonstrates type safety issues with generic arrays
    public static void genericArraySafety() {
        // Create an array of Object type to hold any type of object
        Object[] array = new String[10];  // This compiles but is not type-safe

        // This will cause a ClassCastException at runtime
        try {
            // Attempting to assign a String to an Integer array will result in a runtime error
            array[0] = new Integer(10);  // This should cause a ClassCastException
            System.out.println("Array value: " + array[0]);
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Demonstrating restriction 1: Cannot create generic arrays
        createGenericArray();

        // Demonstrating restriction 2: Type safety issues with generic arrays
        genericArraySafety();
    }
}

/* SAMPLE OUTPUT
Created an ArrayList of generic type.
ArrayStoreException: object of type java.lang.Integer cannot be stored in an array of type java.lang.String[]
*/