/* Write a java program to enter the numbers till the user wants and at the end the program 
displays  the largest, smallest, sum of the numbers, average of the numbers entered.
Do-while loop should be used to ask the user whether he or she wishes to perform the operation again. 
If so, the loop should repeat; 
otherwise, it should terminate  */

public class NumberStatistics {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int largest = Integer.MIN_VALUE; // Initialize to smallest possible integer
    int smallest = Integer.MAX_VALUE; // Initialize to largest possible integer
    int sum = 0;
    int count = 0;
    char choice;

    do {
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();

      // Update sum and count
      sum += number;
      count++;

      // Update largest and smallest numbers
      if (number > largest) {
        largest = number;
      }
      if (number < smallest) {
        smallest = number;
      }

      // Ask the user if they want to continue
      System.out.print("Do you want to enter another number? (Y/N): ");
      choice = scanner.next().charAt(0);

    } while (choice == 'Y' || choice == 'y');

    // Calculate average if count is greater than 0
    double average = count > 0 ? (double) sum / count : 0;

    // Display the results
    System.out.println("Largest number: " + largest);
    System.out.println("Smallest number: " + smallest);
    System.out.println("Sum of numbers: " + sum);
    System.out.println("Average of numbers: " + average);

    scanner.close();
  }
}

/*
 * SAMPLE OUTPUT
 * OUTPUT1:
 * Enter a number: 15
 * Do you want to enter another number? (Y/N): Y
 * Enter a number: 10
 * Do you want to enter another number? (Y/N): Y
 * Enter a number: 20
 * Do you want to enter another number? (Y/N): N
 * Largest number: 20
 * Smallest number: 10
 * Sum of numbers: 45
 * Average of numbers: 15.0
 * 
 * OUTPUT2:(when user enters negative numbers):
 * Enter a number: -5
 * Do you want to enter another number? (Y/N): Y
 * Enter a number: -15
 * Do you want to enter another number? (Y/N): Y
 * Enter a number: 0
 * Do you want to enter another number? (Y/N): N
 * Largest number: 0
 * Smallest number: -15
 * Sum of numbers: -20
 * Average of numbers: -6.666666666666667
 * 
 * OUTPUT3: (when user enters only one number)
 * Enter a number: 25
 * Do you want to enter another number? (Y/N): N
 * Largest number: 25
 * Smallest number: 25
 * Sum of numbers: 25
 * Average of numbers: 25.0
 */