package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.FormattingNumbers;

import java.text.NumberFormat;

public class NumberFormatClassApp {
    static NumberFormat cf =
            NumberFormat.getNumberInstance();
    public static void main(String[] args)
    {
        printMyAllowance();
        printCostOfPaintBallGun();
    }
    public static void printMyAllowance()
    {
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My allowance: "
                + cf.format(myAllowance));
    }
    public static void printCostOfPaintBallGun()
    {
        double costOfPaintBallGun = 69.95;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("Cost of Paint Ball Gun: "
                + cf.format(costOfPaintBallGun));
    }
}
