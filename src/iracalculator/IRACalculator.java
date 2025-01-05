package iracalculator;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class IRACalculator {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("IRA Calculator");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new IRAJPanelForm());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setExtendedState(frame.getExtendedState() | frame.MAXIMIZED_BOTH);
    }    
}
