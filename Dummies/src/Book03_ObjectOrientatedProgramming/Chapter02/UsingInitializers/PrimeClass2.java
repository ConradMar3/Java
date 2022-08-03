package Book03_ObjectOrientatedProgramming.Chapter02.UsingInitializers;

import java.util.Scanner;

public class PrimeClass2 {
    private Scanner sc = new Scanner(System.in);
    public int x = getX();

    private int getX() {
        System.out.print("Enter the starting value "
                + "for x: ");
        return sc.nextInt();
    }
}
