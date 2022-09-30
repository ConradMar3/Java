package Book2_page65.Chapter02.DeclaringLocalVariables;

public class Error {
    public static void main(String[] args) {

        //Add String for helloMessage:

        String helloMessage;
        helloMessage = "Hello, World!"; // error -- helloMessage
        System.out.println(helloMessage); // is not yet declared
    }
}
