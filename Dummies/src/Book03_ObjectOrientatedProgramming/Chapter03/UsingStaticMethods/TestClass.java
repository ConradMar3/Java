package Book03_ObjectOrientatedProgramming.Chapter03.UsingStaticMethods;

public class TestClass {
    private  int x = 5; //Instance variable.

    public static void main(String[] args) {
       // int y = x;
        String y = "Won't compile, main is static.";
        System.out.println(y);
    }
}
