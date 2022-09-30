package Book2_page65.Chapter07.Methods.UsingPassByValue;

public class ChangeParameters {
    public static void main(String[] args) {
        int number = 1;
        tryToChangeNumber(number);
        System.out.println(number);
    }

    public static void tryToChangeNumber(int i) {
        i = 2;
    }
}
