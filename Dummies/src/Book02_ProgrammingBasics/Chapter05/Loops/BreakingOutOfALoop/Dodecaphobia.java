package Book02_ProgrammingBasics.Chapter05.Loops.BreakingOutOfALoop;

public class Dodecaphobia {
    public static void main(String[] args) {
        int number = 2;
        while (number <= 20) {
            if (number == 12)
                break;
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}

// When a break statement is executed
// in a while loop, the loop ends immediately.