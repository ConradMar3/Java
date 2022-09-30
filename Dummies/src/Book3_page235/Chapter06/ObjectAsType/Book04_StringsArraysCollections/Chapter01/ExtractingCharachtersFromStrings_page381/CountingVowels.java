package Book3_page235.Chapter06.ObjectAsType.Book04_StringsArraysCollections.Chapter01.ExtractingCharachtersFromStrings_page381;

import java.util.Scanner;

public class CountingVowels {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == 'A') || (c == 'a')
                    || (c == 'E') || (c == 'e')
                    || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o')
                    || (c == 'U') || (c == 'u'))
                vowelCount++;
        }
        System.out.println("That string contains "
                + vowelCount + " vowels.");
    }
}

/* You can use the 'charAt' method to extract a character.
 Keep in mind that the index number for the first character in
 a string is 0, not 1.

 If you specify an index value that’s beyond the end of the string,
 the exception StringIndexOutOfBoundsException is thrown. (Fortunately, this
 is an unchecked exception, so you don’t have to enclose the charAt method in a
 try/catch statement.)
 */
