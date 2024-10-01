package operators;

// Importing the Scanner class to take user input
import java.util.Scanner;

public class arithmeticOperators {
    public static void main(String[] args) {
        // Declaring variables 'a' and 'b' to store user input, and 'result' to store arithmetic operation results
        int a, b, result;
        
        // Creating a Scanner object to capture input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input two integers
        System.out.print("Enter the value of a and b: ");
        
        // Taking two integer values from the user and storing them in 'a' and 'b'
        a = scanner.nextInt();
        b = scanner.nextInt();

        // Performing arithmetic addition of a and b, and storing the result
        result = a + b; 
        // Displaying the result of the addition
        System.out.println("Addition Result: " + result);

        // Performing arithmetic subtraction (a - b) and storing the result
        result = a - b;
        // Displaying the result of the subtraction
        System.out.println("Subtraction Result: " + result);

        // Performing arithmetic multiplication of a and b, and storing the result
        result = a * b;
        // Displaying the result of the multiplication
        System.out.println("Multiplication Result: " + result);

        // Performing arithmetic division (a / b) and storing the result
        result = a / b;
        // Displaying the result of the division
        System.out.println("Division Result: " + result);

        // Performing modulus operation (a % b) to get the remainder and storing the result
        result = a % b;
        // Displaying the result of the modulus operation (remainder)
        System.out.println("Remainder Result: " + result);

        scanner.close();
    }
}
