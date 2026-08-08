import java.util.*;

public class CO2AT1 {

    // Method to normalize customer
    public static String normalizeName(String name) {

        // Remove leading and trailing spaces
        String normalized = name.trim();

        // Remove duplicate spaces
        normalized = normalized.replaceAll("\\s+", " ");

        // Convert to lowercase
        normalized = normalized.toLowerCase();

        // Split the string into words
        String[] words = normalized.split(" ");

        StringBuilder result = new StringBuilder();

        // Capitalize the first letter of each word
        for (String word : words) {

            if (word.length() > 0) {

                char firstLetter = Character.toUpperCase(word.charAt(0));

                String remainingLetters = word.substring(1);

                result.append(firstLetter)
                      .append(remainingLetters)
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");

        String originalName = sc.nextLine();

        String normalizedName = normalizeName(originalName);

        System.out.println("\nOriginal Name   : " + originalName);
        System.out.println("Normalized Name : " + normalizedName);

        sc.close();
    }
}