package Book5_page475.Chapter01_ExtendingThreads_page478;

public class CountDownApp {
    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        clock.start();
    }
}
