
/**
 * Admin IS-A customer with a bottomless card. This is the default login state 
 * for anyone starting the CFG Shop program. This class creates the Admin as a 
 * Customer with 1 billion dollars and a card number of one. There can be 
 * multiple admins at one time.
 * 
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 * 
 */
public class Admin extends Customer{    

    /**
     * Constructor for Admin. Creates a child Customer object with a card number: 1 
     * and balance: 1 billion dollars.
     */
    public Admin(){
        super("Admin");
        super.setCard(new Card(getName(), 1, 1000000000));
    }
}
