package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.RandomNumbers;

public class CreatingRandomNumbers {
    public static void main(String[] args) {
        int low = 0;
        int high = 10;
        int rnd = (int)(Math.random() * (high - low + 1)) + low;
        System.out.println(rnd);
    }
}
