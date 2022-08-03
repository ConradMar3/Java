package Book02_ProgrammingBasics.Chapter08.Exceptions.DisplayingException;

//java.lang.ArithmeticException;

public class DisplayingException {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace(System.out);
        }
    }
}
