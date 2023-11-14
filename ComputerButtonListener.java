import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ComputerButtonListener implements ActionListener{

    PC pc;

    public ComputerButtonListener(PC newPC){
        pc = newPC;
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showOptionDialog(null, pc.toString(), "Would you like to buy this PC?", 0, 0, (new ImageIcon("PCIcons\\icon" + pc.getFrameNumber() + ".jpg")), null, e);
    }
}