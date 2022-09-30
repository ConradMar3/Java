package Book2_page65.Chapter05.Loops.ForLoops.NestingLoops;

public class NestedLoop {
    public static void main(String[] args) {
        for(int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++)
                System.out.print(x + "-" + y + " ");
            System.out.println();
        }
    }
}
