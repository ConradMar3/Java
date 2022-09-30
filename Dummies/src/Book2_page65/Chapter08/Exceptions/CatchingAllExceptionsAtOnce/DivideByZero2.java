package Book2_page65.Chapter08.Exceptions.CatchingAllExceptionsAtOnce;

import java.util.InputMismatchException;

public class DivideByZero2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0; // you know this won't work
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println("Oops, you can't "
                    + "divide by zero.");
        }
        try {
            // statements that might throw several types of // exceptions
        } catch (InputMismatchException e) {
            // statements that process InputMismatchException
        } catch (Exception e) {
            // statements that process all other exception types
        }
    }
}
