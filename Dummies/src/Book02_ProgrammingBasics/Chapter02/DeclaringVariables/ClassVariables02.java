package Book02_ProgrammingBasics.Chapter02.DeclaringVariables;

//Example 02
//Declaring class variable at end of class
public class ClassVariables02 {
    public static void main(String[] args)
    {
        helloMessage = "Hello, World!";
        System.out.println(helloMessage);
    }
    static String helloMessage;
}

