package Book02_ProgrammingBasics.Chapter02.DeclaringVariables;

// Example 01
// Declaring class variable at beginning of class
public class ClassVariables01 {
      static String helloMessage;
      public static void main(String[] args) {
          helloMessage = "Hello, World!";
          System.out.println(helloMessage);
  }
}
