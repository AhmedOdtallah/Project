import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ComputerButtonListener implements ActionListener{

    Object pc;

    public ComputerButtonListener(PC newPC){
        pc = newPC;
    }

    public void actionPerformed(ActionEvent e) {
        if(pc instanceof Desktop){
            JOptionPane.showOptionDialog(null, ((Desktop)pc).toString(), "Would you like to buy this PC?", 0, 0, (new ImageIcon("PCIcons\\icon" + ((Desktop)pc).getFrameNumber() + ".jpg")), null, e);
        }
    }
}