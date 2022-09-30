package Book3_page235.Chapter08.WorkingWithPackages.ImportingClassesAndPackages_page354.util;

import java.util.Scanner;
public class Console
{
    static Scanner sc = new Scanner(System.in);
    public static boolean askYorN(String prompt)
    {
        while (true)
        {
            String answer;
            System.out.print("\n" + prompt
                    + " (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y"))
                return true;
            else if (answer.equalsIgnoreCase("N"))
                return false;
        }
    }
}