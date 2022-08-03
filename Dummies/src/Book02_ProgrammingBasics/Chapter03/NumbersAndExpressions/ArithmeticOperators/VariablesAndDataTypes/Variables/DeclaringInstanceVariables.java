package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.Variables;

public class DeclaringInstanceVariables {
    static String helloMessage; // error -- should use static keyword
    public static void main(String[] args)
    {
        helloMessage = "Hello, World!";
        System.out.println(helloMessage); // will not compile
    }
}
