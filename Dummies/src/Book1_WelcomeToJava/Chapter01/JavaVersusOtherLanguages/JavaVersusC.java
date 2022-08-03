package Book1_WelcomeToJava.Chapter01.JavaVersusOtherLanguages;

/**
 * The type Java versus c.
 */
public class JavaVersusC {
    // This is C or C++ printing "Hello, World!"
    /*
    main()
        {
            printf("Hello, World!");
        }
     */

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
//Java:
    public static void main(String[] args) {
        System.out.println("Java, Hello World!");
        //Other example:
        String java = "Hello, World!";
        System.out.println(java);
    }
}
