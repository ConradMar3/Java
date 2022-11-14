package Book5_page475.Chapter01_CountDownApp_page483;

public class CountDownApp {
    public static void main(String[] args) {

        Thread clock = new CountDownClock();

        java.lang.Runnable flood, ignition, liftoff;

        flood = new LaunchEvent(16, "Flood the pad!");
        ignition = new LaunchEvent(6, "Start engines!");
        liftoff = new LaunchEvent(0, "Liftoff!");

        clock.start();

        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start();
    }
}