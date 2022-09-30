package Book3_page235.Chapter06.ObjectAsType.Book04_StringsArraysCollections.Chapter01.SimpleStringMods_page380;

public class StringMods {
    public static void main(String[] args) {
        String s1 = "FORTIS FORTUNA ADIUVAT.";
        String s2 = s1.toLowerCase();

        System.out.println(s2);

        String s = "    FORTIS FORTUNA ADIUVAT.    ";
        s = s.trim();

        System.out.println(s);
    }
}
