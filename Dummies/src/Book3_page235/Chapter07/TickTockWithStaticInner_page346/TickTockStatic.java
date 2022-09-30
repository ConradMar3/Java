package Book3_page235.Chapter07.TickTockWithStaticInner_page346;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TickTockStatic {
    //The tickMessage field is declared as static. This is necessary so that
    //the static class can access it.
    private static String tickMessage = "Tick...";
    //The tockMessage field is also declared as static.
    private static String tockMessage = "Tock...";

    public static void main(String[] args) {
        TickTockStatic t = new TickTockStatic();
        t.go();
    }

    private void go() {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }

    //The Ticker class is declared as static.
    static class Ticker implements ActionListener {
        private boolean tick = true;

        public void actionPerformed(ActionEvent event) {
            if (tick) {
                System.out.println(tickMessage);
            } else {
                System.out.println(tockMessage);
            }
            tick = !tick;
        }
    }
}
