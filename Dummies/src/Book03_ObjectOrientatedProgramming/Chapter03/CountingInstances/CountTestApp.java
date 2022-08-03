package Book03_ObjectOrientatedProgramming.Chapter03.CountingInstances;

public class CountTestApp {
    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest();
            printCount();
        }
    }

    private static void printCount() {
        System.out.println("There are now "
                + CountTest.getInstanceCount()
                + " instances of the CountTest class"
                + " \n\tand a serious amount of relentless rage!");
    }
}

class CountTest {
    private static int instanceCount = 0;

    public CountTest() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
