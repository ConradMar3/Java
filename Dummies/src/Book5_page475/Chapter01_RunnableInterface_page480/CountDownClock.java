package Book5_page475.Chapter01_RunnableInterface_page480;

import java.util.ArrayList;

public class CountDownClock extends Thread {
    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        ArrayList<java.lang.Runnable> events
                = new ArrayList<java.lang.Runnable>();
        events.add(new LaunchEvent(16, "Flood the pad!"));
        events.add(new LaunchEvent(6, "Start engines!"));
        events.add(new LaunchEvent(0, "Liftoff!"));
        clock.start();
        for (java.lang.Runnable e : events)
            new Thread(e).start();
    }
}
