package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.UnaryPlusAndMinusOperators;

public class UnaryPlusAndMinusOperators {
    public static void main(String[] args) {
        //Example of Unary Operator:
        int a = 5; // a is 5
        int b = -a; // b is -5
        int c = -b; // c is +5
        System.out.println(a + " " + b + " " + c);

        //Example of Unary Plus Operator:
        int a1 = -5; // a is -5
        int b1 = +a1; // b is -5
        a1 = 5; // a1 is now 5
        int c1 = +a1; // c is 5
        System.out.println(a1 + " " + b1 + " " + c1);

        // Complex Expression:
        int a2 = 3, b2 = 4, c2 = 5;
        int d2 = a2 * -(b2 + c2); // d is -27
        System.out.println(a2 + " " + b2 + " " + c2 + " " + d2);
    }
}
