package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.Strings;

public class CombiningStrings {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World!";
        String helloWorld = hello + world;
        System.out.println(hello + " " + world + " " + helloWorld);

        // Example of different concat:
        String hello2 = "Hello";
        String world2 = "World!";
        String greeting = hello2 + "," + world2;
        System.out.println(hello2 + " " + world2 + " " + greeting);
    }
}
