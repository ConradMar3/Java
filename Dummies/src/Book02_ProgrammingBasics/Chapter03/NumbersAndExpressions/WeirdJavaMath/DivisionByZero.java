package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.WeirdJavaMath;

public class DivisionByZero {
    public static void main(String[] args) {
        double i = 50.0;
        double j = 0.0;
        double k = i / j;
        System.out.println(k);

        //Out: infinity!
    }
}
