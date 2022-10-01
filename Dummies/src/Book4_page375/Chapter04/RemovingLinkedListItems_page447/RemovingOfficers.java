package Book4_page375.Chapter04.RemovingLinkedListItems_page447;

import java.util.LinkedList;

public class RemovingOfficers {
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<>();
        // .add = Add Strings in order typed:
        officers.add("Fuzz");
        officers.add("Fav'o");
        officers.add("Rabbit");
        officers.add("Pierce");
        officers.add("Moustache");
        for (String s : officers)
            System.out.println(s);

        // To remove
        // item 3, for example, use a statement like this:
        officers.remove(3);

        // If you have a reference to the item that you want to remove, use the remove
        // method, like this:
        officers.remove("Fuzz");

        // To remove all the items from the list, use the clear method:
        officers.clear(); // Goodbye, Farewell, and Amen.
    }
}
