package Book02_ProgrammingBasics.Chapter05.Loops.ContinueStatement;

public class Dodecaphobia3 {
    public static void main(String[] args) {
        int number = 0;
        while (number < 20) {
            number += 2;
            if (number == 12)
                continue;
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

//Instead of stopping the loop like the 'break',
//the 'continue' statement just iterates over 12.