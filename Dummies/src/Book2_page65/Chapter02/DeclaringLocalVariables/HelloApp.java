package Book2_page65.Chapter02.DeclaringLocalVariables;

public class HelloApp {
    public static void main(String[] args) {
        String helloMessage;
        helloMessage = "Hello, World!";
        System.out.println(helloMessage);
    }
}

/*
A local variable is a variable that’s declared within the body of a method. Then you
can use the variable only within that method. Other methods in the class aren’t
even aware that the variable exists.
 */