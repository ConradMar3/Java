package Book02_ProgrammingBasics.Chapter01.JavaProgrammingBasics.Blocks;

public class Block {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        if ( i > 0)
        {
            String s = "The value of i is " + i;
            System.out.print(s);
        }
        if ( i > 0) {
            String s = "The value of i is " + i;
            System.out.print(s);
        }
    }
}
