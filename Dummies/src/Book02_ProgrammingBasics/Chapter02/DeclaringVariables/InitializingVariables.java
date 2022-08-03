package Book02_ProgrammingBasics.Chapter02.DeclaringVariables;

/*This won't compile. i hasn't been assigned a value.
public class InitializingVariables {
  public static void main(String[] args) {
    int i;
    System.out.println("The value of i: " + i);
  }
}
*/

// instead:
public class InitializingVariables {
  public static void main(String[] args) {
    int i;
    i = 1;
    System.out.println("i is: " + i);
  }
}