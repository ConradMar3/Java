package Book02_ProgrammingBasics.Chapter06.SwitchStatements.UsingSwitchStatement;

import java.util.Scanner;

public class CommissionRate {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Sales Class: ");

        double commissionRate;
        int salesClass = sc.nextInt();
        switch (salesClass) {
            case 1:
                commissionRate = 0.02;
                break;
            case 2:
                commissionRate = 0.035;
                break;
            case 3:
                commissionRate = 0.05;
                break;
            default:
                commissionRate = 0.0;
                break;
        }
        System.out.println(commissionRate);
    }
}
