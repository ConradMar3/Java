package Book02_ProgrammingBasics.Chapter05.Loops.InfiniteLoop;

//Avoiding an Infinite Loop, use a 'break':

public class Dodecaphobia2 {
    public static void main(String[] args) {
        int number = 2;
        while (true) {
            if (number == 12)
                break;
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }
}
