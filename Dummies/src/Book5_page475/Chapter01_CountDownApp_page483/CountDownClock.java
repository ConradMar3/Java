package Book5_page475.Chapter01_CountDownApp_page483;

public class CountDownClock extends Thread {
    public void run() {
        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
