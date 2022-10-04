package Book5_page475.Chapter03_UsingRecursion_page523.RecursiveSolution_page524;

public class Factorial {
    private static long factorial(int n)
    {
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
}
