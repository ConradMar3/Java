package Book02_ProgrammingBasics.Chapter04.MakingChoices.SimpleBooleanExpression;

public class IfElseStatement {
    public static void main(String[] args) {
        double salesTotal = 123.0;
        double commissionRate;
        if (salesTotal <= 10000.0)
            commissionRate = 0.02;
        else
            commissionRate = 0.05;
    }
}

/* Block:
double commissionRate;
if (salesTotal <= 10000.0)
{
 commissionRate = 0.02;
 level1Count++;
}
else
{
 commissionRate = 0.05;
 level2Count++;
}
 */