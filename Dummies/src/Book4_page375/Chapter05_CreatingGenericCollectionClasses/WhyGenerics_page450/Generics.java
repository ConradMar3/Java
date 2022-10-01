package Book4_page375.Chapter05_CreatingGenericCollectionClasses.WhyGenerics_page450;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        
        /* Before Java 1.5, collection classes could hold any type of object. For example, the
           add method for the ArrayList class had this declaration:

           > public boolean add(Object o)
            {
                // code to implement the add method
            }
         */

        // Thus, you could pass any type of object to the add method — and the array list
        // gladly accepted it.

        /* If you had an array
           list named empList with Employee objects, you’d use a statement like this one to
           get the first Employee from the list:

           > Employee e = (Employee)empList.get(0);
           !! - The trouble is, what if the first item in the list isn’t an Employee? Because the add
                method accepts any type of object.
         */

        // That’s why generics were invented. Now you can declare the ArrayList like this:

        ArrayList<Employee1> empList = new ArrayList<>();

        // Here empList is declared as an ArrayList that can hold only Employee types. Now
        // the add method has a declaration that is the equivalent of this:



    }
}
