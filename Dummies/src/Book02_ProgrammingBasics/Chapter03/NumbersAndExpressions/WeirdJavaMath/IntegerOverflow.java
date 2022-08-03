package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.WeirdJavaMath;

public class IntegerOverflow {
    public static void main(String[] args) {
        int a = 1000000000;
        System.out.println(a);
        a += 1000000000;
        System.out.println(a);
        a += 1000000000;
        System.out.println(a);
        a += 1000000000;
        System.out.println(a);
    }
}
