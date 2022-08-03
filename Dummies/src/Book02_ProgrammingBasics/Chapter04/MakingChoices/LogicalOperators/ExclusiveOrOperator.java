package Book02_ProgrammingBasics.Chapter04.MakingChoices.LogicalOperators;

public class ExclusiveOrOperator {
    public static void main(String[] args) {
        int switch1 = 0;
        int switch2 = 0;

/*        if ( switch1 == switch2 )
            System.out.println("Trouble! The switches are the same");
        else
            System.out.println("OK, the switches are different.");

 */
        if ((switch1==1)^(switch2==-1))
            System.out.println("OK, the switches are different.");
        else
            System.out.println("Trouble! The switches are the same");
    }
}
