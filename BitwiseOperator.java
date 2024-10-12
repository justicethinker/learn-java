package operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        byte val1 = 12;     // 0000 1100
        byte val2 = 10;   // 0000 1010
        byte res;

        //12 = 8 + 4 = 0000 1100 => (0000 1100 + 1) = -(12 + 1) + - 13
        res = (byte) ~val1; //bitwise compliment val1
        System.out.println("The result: " + res);

        res = (byte) (val1 & val2); //bitwise AND operation
        System.out.println("The result:" + res);

        res =(byte) (val1 | val2); //bitwise OR operarion
        System.out.println("The result:" + res);

        res = (byte) (val1 ^ val2); //bitwise XOR operation
        System.out.println("The result" + res);

        res = (byte) (val1 << 2); //shift 2 bits to the left
        System.out.println("The result:" + res);

        res = (byte) (val1 >> 2); //shift 2 bits to the right
        System.out.println("The result" + res);
            
    }
}
