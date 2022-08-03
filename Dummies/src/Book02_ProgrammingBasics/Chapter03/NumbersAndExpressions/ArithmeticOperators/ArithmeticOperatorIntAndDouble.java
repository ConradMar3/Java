package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.ArithmeticOperators;

public class ArithmeticOperatorIntAndDouble {
    public static void main(String[] args) {
        // int types:
        int a = 32, b = 5;
        int c = a + b; // c is 37
        int d = a - b; // d is 27
        int e = a * b; // e is 160
        int f = a / b; // f is 5 (32 / 5 is 6 remainder 2)
        int g = a % b; // g is 2 (32 / 5 is 6 remainder 2)
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);

        a++; // a is now 33
        b--; // b is now 4
        System.out.println(a + " " + b);

        // double types:
        double x = 5.5, y = 2.0;
        double m = x + y; // m is 7.5
        double n = x - y; // n is 3.5
        double o = x * y; // o is 11.0
        double p = x / y; // p is 2.75
        double q = x % y; // q is 1.5
        System.out.println(x + " " + y + " " + m + " " + n + " " + o + " " + p + " " + q);

        x++; // x is now 6.5
        y--; // y is now 1.0
        System.out.println(x + " " + y);
    }
}
