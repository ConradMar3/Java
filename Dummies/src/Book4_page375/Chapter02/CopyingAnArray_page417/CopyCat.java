package Book4_page375.Chapter02.CopyingAnArray_page417;

import java.util.Arrays;

public class CopyCat {
    public static void main(String args[]) {
        int arrayOriginal[] = {42, 55, 21};
        int arrayNew[] =
                Arrays.copyOf(arrayOriginal, 3);
        printIntArray(arrayNew);
    }

    static void printIntArray(int arrayNew[]) {
        for (int i : arrayNew) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }
}

/*
The copyOfRange method is even more versatile. If you execute the instruction's:

> int arrayOriginal[] = {42, 55, 21, 16, 100, 88};
> int arrayNew[] = Arrays.copyOfRange(arrayOriginal, 2, 5);

the values in arrayNew are:

21 16 100
 */