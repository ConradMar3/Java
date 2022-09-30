package Book3_page235.Chapter07.UsingStaticInnerClasses_page345;

//A static inner class is similar to an inner class but doesn't require an instance of the outer class.

/*
public class StaticInnerClass {
    public static void main(String[] args) {
        class outerClassName {
            private static class innerClassName {
                // body of inner class
            }
        }
    }
}
*/

/*
Like a static method, a static inner class can’t access any nonstatic fields or methods in its outer class.
It can access static fields or methods, however.
*/