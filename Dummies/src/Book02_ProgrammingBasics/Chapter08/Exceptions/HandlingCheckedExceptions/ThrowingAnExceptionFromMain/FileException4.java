package Book02_ProgrammingBasics.Chapter08.Exceptions.HandlingCheckedExceptions.ThrowingAnExceptionFromMain;

import java.io.FileNotFoundException;

public class FileException4 {
    public static void main(String[] args)
            throws FileNotFoundException
    {
        openFile4("C:\test.txt");
    }

    private static void openFile4(String s) {
    }
}
