package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.CombiningOperators;

public class CombiningOperators {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int d1 = a * b / c; // d1 is 4
        int d2 = a * (b / c); // d2 is 0
        System.out.println(d1 + " " + d2);
    }
}
