package Book02_ProgrammingBasics.Chapter08.Exceptions.HandlingCheckedExceptions.SwallowingExceptions;

import java.io.*;

public class FileException5 {
    public static void main(String[] args) {
        openFile("C:\test.txt");
    }

    public static void openFile(String name) {
        try {
            FileInputStream f = new FileInputStream(name);
        } catch (FileNotFoundException e) {
        }
    }
}

