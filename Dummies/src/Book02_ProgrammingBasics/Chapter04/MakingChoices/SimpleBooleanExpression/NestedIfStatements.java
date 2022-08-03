package Book02_ProgrammingBasics.Chapter04.MakingChoices.SimpleBooleanExpression;

public class NestedIfStatements {
    public static void main(String[] args) {
        int salesClass = 2;
        double salesTotal = 1234.0;
        double commissionRate;
        if (salesTotal < 10000)
            if (salesClass == 1)
                commissionRate = 0.02;
            else
                commissionRate = 0.04;
        else
        if (salesClass == 1)
            commissionRate = 0.025;
        else
            commissionRate = 0.05;
        System.out.println(commissionRate);
    }
}
