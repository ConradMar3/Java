package Book02_ProgrammingBasics.Chapter04.MakingChoices.ComparingStrings;

public class ComparingStrings {
    public static void main(String[] args) {
        String answer = "Yes";
        String input = "End";

        //Use .equals():
        if (answer.equals("Yes"))
            System.out.println("The answer is Yes.");

        //Input case is ignored, could also be "END" or "End":
        if (input.equalsIgnoreCase("end"));
        // end the program
        System.out.println(input + " " + answer);
    }
}
