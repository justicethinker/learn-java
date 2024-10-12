package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean result;  // Variable to store the result of relational operations
        
        // Check if 10 is equal to 10 (equality operator)
        result = (10 == 10); // true when the left operand is exactly equal to the right operand
        System.out.println("The result is " + result);  // Output: true

        // Check if 5 is less than 5
        result = (5 < 5);  // false since 5 is not less than 5
        System.out.println("The result is " + result);  // Output: false

        // Check if 5 is less than or equal to 5
        result = (5 <= 5);  // true since 5 is equal to 5
        System.out.println("The result is " + result);  // Output: true

        // Check if 10 is greater than 5
        result = (10 > 5);  // true since 10 is greater than 5
        System.out.println("The result is " + result);  // Output: true

        // Check if 10 is greater than or equal to 5
        result = (10 >= 5);  // true since 10 is greater than 5
        System.out.println("The result is " + result);  // Output: true

        // Check if 2 is not equal to 2
        result = (2 != 2);  // false since 2 is equal to 2
        System.out.println("The result is " + result);  // Output: false
    }
}
