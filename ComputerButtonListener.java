

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * The ComputerButtonListener class IS-AN ActionListener that handles button click 
 * events for displaying PC information and initiating a purchase. Also creates a 
 * dialog that the user will be able to select their decision on their purchase.
 * 
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 * 
 */
public class ComputerButtonListener implements ActionListener {

    private PC pc;
    private int response = 0;

    /**
     * Constructor for the ComputerButtonListener class.
     * 
     * @param newPC associated with the button click event.
     */
    public ComputerButtonListener(PC newPC){
        pc = newPC;
    }

    /**
     * Performs actions in response to a button click event, then displays PC specifications and prompts 
     * the user if they would like to purchase the PC. If the user chooses to buy, the purchase is 
     * initiated and a message is printed.
     * 
     * @AreaOfFutureDevelopment Implement a better system where the purchase is shown as a dialog and saved 
     * to a file using a PrintWriter.
     * 
     * @param e take a guess.
     */
    public void actionPerformed(ActionEvent e) {
        //Context switch between a Desktop dialog or a Laptop dialog
        if(pc instanceof Desktop){
            response = JOptionPane.showOptionDialog(null, ((Desktop)pc).toString(), "Would you like to buy this PC?", 0, 0, pc.getIcon(), null, e);
        } else if(pc instanceof Laptop){
            response = JOptionPane.showOptionDialog(null, ((Laptop)pc).toString(), "Would you like to buy this PC?", 0, 0, pc.getIcon(), null, e);
        }        
        //Print to terminal if the purchase was completed successfully, otherwise, do nothing.
        if(response == 0){
            try{
                TestProject.admin.purchase((PC)pc);
            }catch(InsufficientFundsException error){
                System.out.println("How did you manage to drain the admin account dawg restart the program.");
            }
            System.out.println("Admin has purchased a " + pc.pcType() + " at the price of " + pc.getPrice());
        }
    }
}
