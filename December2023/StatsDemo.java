/* Create a generic interface Stats with a method double avg() to compute and return the average of numeric values from the invoking object. Provide an implementation to this method through a class StatsImpl, with appropriate data member(s). This class must also provide another member function compareAvg() that compares the average of any two valid generic objects and returns true or false appropriately. Demonstrate instantiation, computation, and comparison of average of generic objects inside StatsDemo class by calling the above methods suitably.  */

import java.util.Arrays;
import java.util.List;

// Define a generic interface Stats with a method to compute the average of numeric values
interface Stats<T extends Number> {
    double avg();  // Method to compute and return the average of numeric values
}

// Implementing the Stats interface to compute the average and compare averages of generic objects
class StatsImpl<T extends Number> implements Stats<T> {

    private List<T> numbers;

    // Constructor to initialize the list of numbers
    public StatsImpl(List<T> numbers) {
        this.numbers = numbers;
    }

    // Implementation of the avg() method to compute the average of the numbers
    @Override
    public double avg() {
        double sum = 0;
        for (T number : numbers) {
            sum += number.doubleValue();  // Convert each number to double and add to sum
        }
        return sum / numbers.size();  // Return the average
    }

    // Method to compare the average of two Stats objects
    public boolean compareAvg(StatsImpl<T> other) {
        return this.avg() == other.avg();  // Compare averages of the two objects
    }
}

// Main class to run the banking application
public class StatsDemo {

    public static void main(String[] args) {
        // Create two StatsImpl objects with Integer values
        StatsImpl<Integer> intStats1 = new StatsImpl<>(Arrays.asList(10, 20, 30, 40, 50));
        StatsImpl<Integer> intStats2 = new StatsImpl<>(Arrays.asList(15, 25, 35, 45, 55));

        // Compute and display the averages
        System.out.println("Average of first set of integers: " + intStats1.avg());
        System.out.println("Average of second set of integers: " + intStats2.avg());

        // Compare the averages of the two Stats objects
        if (intStats1.compareAvg(intStats2)) {
            System.out.println("The averages of the two sets are equal.");
        } else {
            System.out.println("The averages of the two sets are not equal.");
        }

        // Create two StatsImpl objects with Double values
        StatsImpl<Double> doubleStats1 = new StatsImpl<>(Arrays.asList(10.5, 20.5, 30.5));
        StatsImpl<Double> doubleStats2 = new StatsImpl<>(Arrays.asList(5.5, 15.5, 25.5, 35.5));

        // Compute and display the averages
        System.out.println("\nAverage of first set of doubles: " + doubleStats1.avg());
        System.out.println("Average of second set of doubles: " + doubleStats2.avg());

        // Compare the averages of the two Stats objects
        if (doubleStats1.compareAvg(doubleStats2)) {
            System.out.println("The averages of the two sets of doubles are equal.");
        } else {
            System.out.println("The averages of the two sets of doubles are not equal.");
        }
    }
}


/* SAMPLE OUTPUT
Average of first set of integers: 30.0
Average of second set of integers: 35.0
The averages of the two sets are not equal.

Average of first set of doubles: 20.5
Average of second set of doubles: 20.5
The averages of the two sets of doubles are equal.
*/