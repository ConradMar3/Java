package Book3_page235.Chapter06.ObjectAsType.Book04_StringsArraysCollections.Chapter01.SplittingStrings_page384;

public class SplitExample {
    public static void main(String[] args) {
        String address =
                "1500 N. Third Street:Fresno:CA:93722";
        String[] parts = address.split(":");

        for (int i = 0; i < parts.length; i++)
            System.out.println(parts[i]);
    }
}
