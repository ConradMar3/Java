package Book3_page235.Chapter06.ObjectAsType.Book04_StringsArraysCollections.Chapter01.ReplacingPartsOfString_page386;

import java.util.Scanner;

public class ReplacingPartsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.replaceAll("cat", "dog");
        System.out.println(s);
    }
}
