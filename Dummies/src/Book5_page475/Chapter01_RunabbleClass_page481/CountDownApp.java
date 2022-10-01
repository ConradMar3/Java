package Book5_page475.Chapter01_RunabbleClass_page481;

import Book5_page475.Chapter01_ImplementingRunnableInterface_page480.CountDownClock;

public class CountDownApp {
    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        java.lang.Runnable flood, ignition, liftoff;
        flood = new LaunchEvent(16, "Flood the pad!");
        ignition = new LaunchEvent(6, "Start engines!");
        liftoff = new LaunchEvent(0, "Liftoff!");
        clock.start();
        new Thread((java.lang.Runnable) flood).start();
        new Thread((java.lang.Runnable) ignition).start();
        new Thread((java.lang.Runnable) liftoff).start();
    }
}

