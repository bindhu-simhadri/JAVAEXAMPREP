/* Write a Java program to find duplicate values in an array of strings and display string and its number of occurrences. */

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateStrings {
    public static void main(String[] args) {
        // Initialize the array of strings
        String[] strings = {"apple", "banana", "apple", "orange", "banana", "apple", "grape"};

        // Create a HashMap to store the count of each string
        Map<String, Integer> stringCountMap = new HashMap<>();

        // Loop through each string in the array
        for (String str : strings) {
            // If the string is already in the map, increment its count
            if (stringCountMap.containsKey(str)) {
                stringCountMap.put(str, stringCountMap.get(str) + 1);
            } else {
                // If the string is not in the map, add it with a count of 1
                stringCountMap.put(str, 1);
            }
        }

        // Display the strings and their number of occurrences
        System.out.println("Duplicate strings and their occurrences:");
        for (Map.Entry<String, Integer> entry : stringCountMap.entrySet()) {
            // Print only the strings that have more than 1 occurrence
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}

/* SAMPLE OUTPUT
Duplicate strings and their occurrences:
apple: 3 times
banana: 2 times
*/