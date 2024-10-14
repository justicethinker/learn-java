package operators;


public class ConditionalOperators {
    public static void main(String [] args){
        boolean bool1, bool2, res;
        bool1 = true;
        bool2 = true;

        res = bool1 || bool2; //true when ar least one value is true
        System.out.println("The result is:" + res);

        res = bool1 && bool2; // true when both values are true
        System.out.println("The result is:" + res);
    }
}
