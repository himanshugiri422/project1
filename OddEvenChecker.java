import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }
}
