package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.UnderstandingScope;

public class ScopeForClassAndLocalVariables {
    static int x;
    public static void main(String[] args) {
        x = 5;
        System.out.println("main: x = " + x);
        myMethod();
    }
    public static void myMethod(){
        int y;
        y = 10;
        if(y == x + 5)
        {
            int z;
            z = 15;
            System.out.println("My Method: z = " + z);
        }
        System.out.println("My Method: x = " + x);
        System.out.println("My Method: y = " + y);
    }
}
