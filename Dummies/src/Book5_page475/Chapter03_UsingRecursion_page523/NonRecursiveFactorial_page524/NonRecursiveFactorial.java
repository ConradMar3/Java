package Book5_page475.Chapter03_UsingRecursion_page523.NonRecursiveFactorial_page524;

public class NonRecursiveFactorial {
    public static void main(String[] args) {
        int n = 5;
        long fact;
        fact = factorial(n);
        System.out.println("The factorial of "+ n + " is "
                + fact + ".");
    }
    private static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }
}
