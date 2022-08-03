package Book02_ProgrammingBasics.Chapter04.MakingChoices.SimpleBooleanExpression;

public class NestedIfStatementsExample2 {
    public static void main(String[] args) {
        int salesClass = 1;
        double salesTotal = 1234.0;
        double commissionRate;

        if (salesTotal < 10000)
        {
            if (salesClass == 1)
                commissionRate = 0.02;
        }
        else
        {
            if (salesClass == 1)
                commissionRate = 0.025;
        }
    }
}
