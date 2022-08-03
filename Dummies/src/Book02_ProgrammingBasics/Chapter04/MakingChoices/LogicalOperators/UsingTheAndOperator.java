package Book02_ProgrammingBasics.Chapter04.MakingChoices.LogicalOperators;

public class UsingTheAndOperator {
    public static void main(String[] args) {
        double salesClass = 1.0;
        double salesTotal = 1000.0;
        double commissionRate;

        if ((salesClass == 1.0) && (salesTotal >= 10000.0)) {
            commissionRate = 0.025;
            System.out.println(commissionRate);
        }
    }
}
