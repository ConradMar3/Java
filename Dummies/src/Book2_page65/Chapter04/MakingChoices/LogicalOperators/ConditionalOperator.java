package Book2_page65.Chapter04.MakingChoices.LogicalOperators;

public class ConditionalOperator {
    public static void main(String[] args) {
        double salesTotal = 10000.0;

        int tier = (salesTotal > 10000.0) ? 1 : 0;

        System.out.println(tier);
    }
}
