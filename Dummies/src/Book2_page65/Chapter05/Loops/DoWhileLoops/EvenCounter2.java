package Book2_page65.Chapter05.Loops.DoWhileLoops;

public class EvenCounter2 {
    public static void main(String[] args) {
        int number = 2;
        do {
            System.out.print(number + " ");
            number += 2;
        } while (number <= 20);
        System.out.println();
    }
}
