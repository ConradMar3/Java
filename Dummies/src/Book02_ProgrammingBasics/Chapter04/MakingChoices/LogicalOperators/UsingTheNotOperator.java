package Book02_ProgrammingBasics.Chapter04.MakingChoices.LogicalOperators;

public class UsingTheNotOperator {
    public static void main(String[] args) {
        //The Not operator reverses the value of a boolean expression.
        boolean yes = true;

        if(yes == false){
            System.out.println("true");
        } else {
            if(yes != false){
                System.out.println("false");
            }
        }

    }
}
