/*
I need to note that primitive types, such as int and double, are not objects. As a
result, they do not inherit the Object class and don’t have access to the methods
listed in the preceding section.
 */

package Book3_page235.Chapter06.PrimitivesAreNotObjects;

public class PrimitivesAreNotObjects {
    // As a result, the following code won’t work:

    /*
    int x = 50;
    String s = x.toString(); // error: won't compile
     */

    public static void main(String[] args) {
        /*
        If you really want to convert an int to a string in this way, you can use a wrapper
        class such as Integer to create an object from the value and then call its toString
        method:
         */
        int x = 50;
        String a = new Integer(x).toString(); // OK

        /*
        Each of the wrapper classes also defines a static toString method, which you can
        use like this:
         */
        int y = 55;
        String b = Integer.toString(y);

        /*
        Sometimes, using the compiler shortcut that lets you use primitive types in string
        concatenation expressions is easier:
         */
        String c = "" + x + "" + y;

        // Here the int variable x is concatenated with an empty string.

        System.out.println(c);
    }
}
