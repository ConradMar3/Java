package Book4_page375.Chapter04.UpdatingLinkedLists_page446;

import java.util.LinkedList;

public class OfficersUpdating {
    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<>();
        // add the original officers
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Tuttle");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        System.out.println(officers);
        // replace Tuttle with Murdock
        officers.set(2, "Murdock");
        System.out.print("\nTuttle is replaced:");
        System.out.println(officers);
    }
}
