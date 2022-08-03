package Book02_ProgrammingBasics.Chapter07.Methods.ScopingOutParameters;

public class ParameterScope {
    public static void main(String[] args) {
        int min = 10;
        int max = 100;
        int number = getRandomNumber(min, max);
        System.out.println(number);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random()
                * (max - min + 1)) + min;
    }
}
