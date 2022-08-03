package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.InitializingVariables;

/* This code won't compile.

public class testApp
{
 public static void main(String[] args)
 {
 int i;
 System.out.println("The value of i is " + i);
 }
}

!You must initialize local variables before you use them.

 */

public class TestApp {
  public static void main(String[] args) {
    int i;
    i = 5;

    System.out.println("The value of i is " + i);
  }
}
