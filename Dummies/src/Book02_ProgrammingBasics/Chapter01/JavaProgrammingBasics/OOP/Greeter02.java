// This class creates a Greeter object
// that displays a hello message
// in a dialog box.

package Book02_ProgrammingBasics.Chapter01.JavaProgrammingBasics.OOP;

import javax.swing.JOptionPane;

public class Greeter02 {

    public void sayHello02() {
        JOptionPane.showMessageDialog(null,
                "Hello, World!", "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
