package Book02_ProgrammingBasics.Chapter03.NumbersAndExpressions.ArithmeticOperators.VariablesAndDataTypes.InputJOptionClass;

import javax.swing.JOptionPane;

public class DialogApp {
    public static void main(String[] args) {
        String s;
        s = JOptionPane.showInputDialog
                ("Enter an integer:");
        int x = Integer.parseInt(s);
        System.out.println("You entered " + x + ".");
    }
}
