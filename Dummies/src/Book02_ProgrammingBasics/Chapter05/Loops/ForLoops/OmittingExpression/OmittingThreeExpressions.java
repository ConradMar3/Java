package Book02_ProgrammingBasics.Chapter05.Loops.ForLoops.OmittingExpression;

import java.util.Scanner;

public class OmittingThreeExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Where should I start? ");
        int a = sc.nextInt();
        for ( ; a >= 0; a--)
            System.out.println(a);
        for(;;)
            System.out.println("Oops");
    }
}

//This creates an Infinite Loop.