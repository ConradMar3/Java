package Book4_page375.Chapter04.AddingItemsToLinkedList_page443;

import java.util.LinkedList;

public class Officers {
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

        // .addFirst = Add Strings in reverse order:
        officers.addFirst("Blake");
        officers.addFirst("Burns");
        officers.addFirst("Houlihan");
        officers.addFirst("Pierce");
        officers.addFirst("McIntyre");
        for (String e : officers)
            System.out.println(e);

        // To insert an object into a specific position into the list, specify the index in the add
        // method, as in this example:
        officers.add("Rozza's");
        officers.add("Blues");
        officers.add("Andy");
        officers.add("Two's");
        officers.add("Cell");
        officers.add(2, "Bigs");
        for (String x : officers)
            System.out.println(x);
    }
}
