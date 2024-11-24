import java.util.Arrays;

public class FindNameInArray {
    public static void main(String[] args) {
        // Array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Name to search for
        String targetName = "Charlie";

        // Using lambda to find the name
        boolean found = Arrays.stream(names)
                .anyMatch(name -> name.equalsIgnoreCase(targetName));

        // Output the result
        if (found) {
            System.out.println("The name \"" + targetName + "\" is found in the array.");
        } else {
            System.out.println("The name \"" + targetName + "\" is not found in the array.");
        }
    }
}
