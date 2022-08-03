package Book02_ProgrammingBasics.Chapter07.Methods.UsingMethodThatReturnsType;

public class MethodReturningTypes {
    public static void main(String[] args) {
        int number = getRandomNumber();
        System.out.println("Number is: " + number);
    }

    public static int getRandomNumber() {
        int num;
        while (true) {
            num = (int) (Math.random() * 20) + 1;
            if (num != 12)
                return num;
        }
    }
}

