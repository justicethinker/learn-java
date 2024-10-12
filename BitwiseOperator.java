package operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        // Declare two byte variables and assign values
        byte val1 = 12;  // 0000 1100 in binary (decimal value 12)
        byte val2 = 10;  // 0000 1010 in binary (decimal value 10)
        byte res;        // Variable to store results of bitwise operations

        // Bitwise complement of val1 (~ flips all bits)
        res = (byte) ~val1; // ~val1 = 1111 0011 (two's complement form for -13)
        System.out.println("The result of ~val1: " + res); // Output: -13

        // Bitwise AND operation (val1 & val2)
        // 0000 1100 (val1) & 0000 1010 (val2) = 0000 1000 (binary for 8)
        res = (byte) (val1 & val2);
        System.out.println("The result of val1 & val2: " + res); // Output: 8

        // Bitwise OR operation (val1 | val2)
        // 0000 1100 (val1) | 0000 1010 (val2) = 0000 1110 (binary for 14)
        res = (byte) (val1 | val2);
        System.out.println("The result of val1 | val2: " + res); // Output: 14

        // Bitwise XOR operation (val1 ^ val2)
        // 0000 1100 (val1) ^ 0000 1010 (val2) = 0000 0110 (binary for 6)
        res = (byte) (val1 ^ val2);
        System.out.println("The result of val1 ^ val2: " + res); // Output: 6

        // Bitwise left shift operation (val1 << 2)
        // Shifts bits of val1 (0000 1100) two positions to the left: 0011 0000 (binary for 48)
        res = (byte) (val1 << 2);
        System.out.println("The result of val1 << 2: " + res); // Output: 48

        // Bitwise right shift operation (val1 >> 2)
        // Shifts bits of val1 (0000 1100) two positions to the right: 0000 0011 (binary for 3)
        res = (byte) (val1 >> 2);
        System.out.println("The result of val1 >> 2: " + res); // Output: 3
    }
}
