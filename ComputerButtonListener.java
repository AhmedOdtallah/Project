import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ComputerButtonListener implements ActionListener{

    PC pc;

    public ComputerButtonListener(PC newPC){
        pc = newPC;
    }

    public void actionPerformed(ActionEvent e) {
        int response = 0;
        if(pc instanceof Desktop){
            response = JOptionPane.showOptionDialog(null, ((Desktop)pc).toString(), "Would you like to buy this PC?", 0, 0, (new ImageIcon("PCIcons\\icon" + ((PC)pc).getFrameNumber() + ".jpg")), null, e);
        }else if(pc instanceof Laptop){
            response = JOptionPane.showOptionDialog(null, ((Laptop)pc).toString(), "Would you like to buy this PC?", 0, 0, (new ImageIcon("PCIcons\\icon" + ((PC)pc).getFrameNumber() + ".jpg")), null, e);
        }        
        if(response == 0){
            TestProject.admin.purchase((PC)pc);
            System.out.println("how");
            System.out.println("Admin has purchased a " + pc.pcType() + " at the price of " + pc.getPrice());
        }
    }
}