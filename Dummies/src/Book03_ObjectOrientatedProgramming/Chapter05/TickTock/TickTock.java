package Book03_ObjectOrientatedProgramming.Chapter05.TickTock;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TickTock {
    public static void main(String[] args) {
        Timer t = new Timer(1000, new Ticker());
        t.start();

        JOptionPane.showMessageDialog(null, "Click OK to exit program");
    }
}

class Ticker implements ActionListener {
    private boolean tick = true;

    public void actionPerformed(ActionEvent event) {
        if (tick) {
            System.out.println("1");
        } else {
            System.out.println("2");
        } if(tick) {
            System.out.println("3");
        } else {
            System.out.println("5");
        } if(tick) {
            System.out.println("8");
        } else {
            System.out.println("13");
        } if(tick) {
            System.out.println("21");
        } else {
            System.out.println("34");
        }
        tick = !tick;
    }
}
