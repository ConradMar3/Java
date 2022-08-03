package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.ShadowingVariables;

/* A shadowed variable is a variable that would otherwise be accessible but is temporarily
   made unavailable because a variable with the same name has been declared
   in a more immediate scope.
*/

public class ShadowingVariables {
    static int x;

    public static void main(String[] args) {
        x = 5;
        System.out.println("x = " + x);
        int x;
        x = 10;
        System.out.println("x = " + x);
        System.out.println("ShadowingVariables.x = " + ShadowingVariables.x);
    }
}
