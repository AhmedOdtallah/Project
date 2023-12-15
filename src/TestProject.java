package src;

import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class IS a threaded class that begins the computer shop simulation, generating 10 random 
 * customers that will then walk in and purchase a PC within the shop. TO-DO: Rename class to 
 * simulation and implement File I/O to save customer information to a log. 
 *
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 * 
 */
public class TestProject extends Thread{

    private static View view;
    protected static final Admin admin = new Admin();

    /**
     * TestProject main()
     * 
     * @param args The command-line arguments.
     */
    public static void main(String[] args){
        view = new View();
        TestProject project = new TestProject();
        project.start();
    }

    /**
     * The run method that simulates the computer shop activities.
     */
    public void run(){
        Random waitTime = new Random();
        ArrayList<Customer> customers = new ArrayList<Customer>();

        // Generate and introduce customers
        for(int i = 0; i < 10; i++){
            Customer customer = new Customer("Customer " + (i+1));
            customer.setBalance(waitTime.nextInt(1000,5000));
            
            customers.add(customer);

            view.addToJTextField(customer.getName() + " walked in!");
            
            // try {
            //     Thread.sleep(waitTime.nextInt(1000,1001));
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }

        // Simulate customers purchasing PCs
        PrintWriter logger = null;
        try{
            logger = new PrintWriter("log.txt");
            while(customers.size() > 0){
                int grabRandomCustomer = waitTime.nextInt(customers.size());
                Customer customer = customers.get(grabRandomCustomer);
    
                while(customers.get(grabRandomCustomer) == null){
                    grabRandomCustomer = waitTime.nextInt(customers.size());
                    customer = customers.get(grabRandomCustomer);
                }
    
                //Reuse waitTime to select a PC 
                int randomPC = waitTime.nextInt(8);
                PC selectedPC = view.getComputer(randomPC);
    
                //Display the customer that purchased the PC in a JOptionPane message dialog
                if(customer.purchase(view.getComputer(randomPC))){
                    logger.append(customer.getName() + " bought pc " + 
                    selectedPC.getFrameNumber() + " for " + selectedPC.getPrice() + "\n");
                }
                customers.remove(grabRandomCustomer);
            }
        }catch(IOException error){
            System.out.println(error.getMessage());
        } catch (InsufficientFundsException error) {
            logger.append(error.getMessage() + "\n");
        }finally{
            logger.close();
        }

    }
}
