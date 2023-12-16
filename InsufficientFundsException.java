
/**
 * InsufficientFundsException IS-AN Exception that is thrown only when a customer
 * doesn't have the requisite funds to complete a purchase on a PC object.
 * 
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 */
public class InsufficientFundsException extends Exception{

    /**
     * Default contstructor for the exception. Requirse a balance and charge to print
     * its error message correctly.
     * 
     * @param balance to display customer balance
     * @param charge to display the amount charged
     */
    public InsufficientFundsException(Customer brokie, int charge){
        super(brokie.getName() + " had insufficient funds to make a " + charge + " purchase.");
    }
}
