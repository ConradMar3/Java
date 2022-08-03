package Book02_ProgrammingBasics.Chapter07.Methods.MethodsThatTakeParameters;

public class MethodWithParameters {
    public static void main(String[] args) {
        int number = getRandomNumber(1, 10);
        System.out.println("Number is: " + number);
    }

    public static int getRandomNumber(int i, int i1) {
        int num;
        while (true) {
            num = (int) (Math.random() * 10) + 1;
            if (num != 6)
                return num;
        }
    }
}

