package Book02_ProgrammingBasics.Chapter02.DeclaringVariables;


// Can't use static in main.
public class DeclaringInstanceVariables {
    static String helloMessage;
    public static void main(String[] args){
        helloMessage = "Hello World.";
        System.out.println(helloMessage);
    }
    }
