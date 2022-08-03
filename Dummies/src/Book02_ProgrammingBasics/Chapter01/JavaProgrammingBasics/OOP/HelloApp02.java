// This application displays a hello message on
// the console by creating an instance of the
// Greeter class and then calling the Greeter
// object's sayHello method.

package Book02_ProgrammingBasics.Chapter01.JavaProgrammingBasics.OOP;

public class HelloApp02 {
    public static void main(String[] args) {
        Greeter myGreeterObject = new Greeter();
        myGreeterObject.sayHello();

        Greeter02 myGreeterObject02 = new Greeter02();
        myGreeterObject02.sayHello02();
    }
}
