

//import Scanner to take input from user
import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner (System.in);

        int num1, num2;
        
        boolean result;  // Variable to store the result of relational operations

       
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();  // Read the first integer input
 
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();  // Read the second integer input
        
        // Check if num1 is equal to num2 (equality operator)
        result = (num1 == num2); // true when the left operand is exactly equal to the right operand
        System.out.println("The result is " + result);  // Output: true

        // Check if num1 is less than num2
        result = (num1 < num2);  
        System.out.println("The result is " + result);  // Output: false

        // Check if num1 is less than or equal to 5
        result = (num1<= num2 ); 
        System.out.println("The result is " + result);  // Output: true

        // Check if num1 is greater than num2 
        result = (num1 > num2);  
        System.out.println("The result is " + result);  // Output: true

        // Check if num1 is greater than or equal to num2 
        result = (num1 >= num2);  
        System.out.println("The result is " + result);  // Output: true

        // Check if num1  is not equal to num2 
        result = (num1 != num2);  
        System.out.println("The result is " + result);  // Output: false
    }
}
