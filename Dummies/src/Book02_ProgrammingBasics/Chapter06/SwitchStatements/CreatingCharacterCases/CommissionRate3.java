package Book02_ProgrammingBasics.Chapter06.SwitchStatements.CreatingCharacterCases;

import java.util.Scanner;

public class CommissionRate3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Sales Class: ");

        double commissionRate;
        String s = sc.next();
        char salesClass = s.charAt(0);
        switch (salesClass)
        {
            case 'A':
            case 'a':
                commissionRate = 0.02;
                break;
            case 'B':
            case 'b':
                commissionRate = 0.035;
                break;
            case 'C':
            case 'c':
                commissionRate = 0.05;
                break;
            default:
                commissionRate = 0.0;
                break;
        }
        System.out.println(commissionRate);
    }
}
