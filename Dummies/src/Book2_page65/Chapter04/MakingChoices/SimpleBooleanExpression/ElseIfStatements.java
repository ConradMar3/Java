package Book2_page65.Chapter04.MakingChoices.SimpleBooleanExpression;

public class ElseIfStatements {
    public static void main(String[] args) {
        double salesTotal = 1234.0;
        double commissionRate;

        if (salesTotal >= 10000.0)
            commissionRate = 0.05;
        else if (salesTotal >= 5000.0)
            commissionRate = 0.035;
        else if (salesTotal >= 1000.0)
            commissionRate = 0.02;
        else
            commissionRate = 0.0;
    }
}
