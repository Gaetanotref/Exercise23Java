/**
 * This is the class with the main method and print the return of the arithmetic's method
 * @author Gaetano Trefiletti
 */
public class Tester {
    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators=new ArithmeticOperators();
        System.out.println(arithmeticOperators.sum(2,3));
        System.out.println(arithmeticOperators.sub(4,3));
        System.out.println(arithmeticOperators.mul(5,3));
        System.out.println(arithmeticOperators.div(10,2));

    }
}
