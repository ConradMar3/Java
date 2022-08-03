package Book02_ProgrammingBasics.Chapter05.Loops.InfiniteLoop;

public class CountForever {
    public static void main(String[] args) {
        int number = 2;
        while (true) {
            System.out.print(number + " ");
            number += 2;
        }
    }
}

//Infinite Loop = specify true for the while expression.
