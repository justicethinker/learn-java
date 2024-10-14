package operators;

// This is the class where we define the conditional operators example
public class ConditionalOperators {
    // The main method is the entry point of the program
    public static void main(String [] args){
        // Declaring boolean variables
        boolean bool1, bool2, res;

        // Assigning values to the boolean variables
        bool1 = true;
        bool2 = true;

        // Using the OR (||) operator: true when at least one value is true
        res = bool1 || bool2;
        // Printing the result of the OR operation
        System.out.println("The result is:" + res);

        // Using the AND (&&) operator: true when both values are true
        res = bool1 && bool2;
        // Printing the result of the AND operation
        System.out.println("The result is:" + res);
    }
}
