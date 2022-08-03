package Book02_ProgrammingBasics.Chapter07.Methods.DeclaringParameters;

public class DeclaringParameters {
    public static void main(String[] args) {
        int number = getRandomNumber(10, 100);
        System.out.println("Number is: " + number);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random()
                * (max - min + 1)) + min;
    }
}
