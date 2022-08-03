package Book02_ProgrammingBasics.Chapter04.MakingChoices.LogicalOperators;

public class UsingOrOperators {
    public static void main(String[] args) {
        double salesTotal = 1000.0;
        int salesClass = 1;
        double commissionRate;

        // if ((salesTotal < 1000.0) | (salesClass == 3))
        //    commissionRate = 0.0;

        // Rather use ||

        if ((salesTotal < 1000.0) || (salesClass == 3))
            commissionRate = 0.0;
    }
}
