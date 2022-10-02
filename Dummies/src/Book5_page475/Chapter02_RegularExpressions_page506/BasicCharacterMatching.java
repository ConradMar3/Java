package Book5_page475.Chapter02_RegularExpressions_page506;

//Example:

import java.util.regex.*;
import java.util.Scanner;

public class BasicCharacterMatching {
    static String a, b, c;
    static Pattern pattern;
    static Matcher matcher;
    static boolean match, validRegex, doneMatching;
    private static Scanner sc =
            new Scanner(System.in);

    public static <a> void main(String[] args) {
        System.out.println("Welcome to the "
                + "Regex Tester\n");
        do {
            do {
                System.out.print("\nEnter regex: ");
                a = sc.nextLine();
                validRegex = true;
                try {a
                    pattern = (a) Pattern.compile(a);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    validRegex = false;

                }
            } while (!validRegex);
            doneMatching = false;
            while (!doneMatching) {
                System.out.print("Enter string: ");
                b = sc.nextLine();
                if (b.length() == 0)
                    doneMatching = true;
                else {
                    matcher = pattern.matcher(c);
                    if (matcher.matches())
                        System.out.println("Match.");

                    else
                        System.out.println(
                                "Does not match.");
                }
            }
        } while (askAgain());
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y"))
            return true;
        return false;
    }
}

