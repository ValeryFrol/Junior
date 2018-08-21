package nestedClass;

import javax.swing.*;

public class NestedClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(5000,true);

        JOptionPane.showMessageDialog(null,"close the prorgam");
        System.exit(0);
    }

}
