package Book02_ProgrammingBasics.Chapter07.Methods.MethodsThatReturnValues;

public class UsingReturnTypeToGetValue {
    public static void main(String[] args) {
        int number = getRandomNumber();
        System.out.println("The number is " + number);
    }

    //Method to return value.
    public static int getRandomNumber() {
        int num = (int) (Math.random() * 10) + 1;
        return num;
    }
}
