package Book02_ProgrammingBasics.Chapter08.Exceptions.CatchingExceptions;

public class DivideByZero {
    public static void main(String[] args) {
        int a = 5;
        int b = 0; // you know this won't work
        try {
            int c = a / b; // but you try it anyway
        } catch (ArithmeticException c) {
            System.out.println("Oops, you can't "
                    + "divide by zero.");
        }
    }
}
