package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.WeirdJavaMath;

public class NaN {
    public static void main(String[] args) {
        double x = Math.sqrt(-50); // Not a number
        double y = x;
        if (x == y)
            System.out.println("x equals y");
    }
}
