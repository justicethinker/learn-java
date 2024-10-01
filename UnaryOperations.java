package operators; // Package for demonstrating various arithmetic and unary operations

public class UnaryOperations {
    public static void main(String[] args) {
        int var1, var2;

        var1 = 50; // Assign 50 to var1

        var2 = -var1; // Unary minus operator to invert the sign of var1
        System.out.println("The var =" + var1 + ", var2 = " + var2);

        var1 = 50; // Reset var1 to 50
        var2 = var1++; // Post-increment: store var1 in var2, then increment var1
        System.out.println("The var1 =" + var1 + ", var2 =" + var2);

        var1 = 50; // Reset var1 to 50
        var2 = ++var1; // Pre-increment: increment var1, then assign to var2
        System.out.println("The var1 =" + var1 + ", var2 =" + var2);

        var1 = 50; // Reset var1 to 50
        var2 = var1--; // Post-decrement: store var1 in var2, then decrement var1
        System.out.println("The var1 = " + var1 + ", var2 =" + var2);

        var1 = 50; // Reset var1 to 50
        var2 = --var1; // Pre-decrement: decrement var1, then assign to var2
        System.out.println("The var1 =" + var1 + ", var2 =" + var2);

        boolean bool1, res;
        bool1 = true; // Assign true to bool1

        res = !bool1; // NOT operator to invert the value of bool1
        System.out.println("The bool1 is " + bool1);
        System.out.println("The result is " + res);
    }
}
