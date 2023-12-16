package src;
import java.util.Random;

/**
 * Customer HAS-A card and is responsible for the customer object. Provides methods to 
 * both access and modify its name, card, and card details. Also provides a 
 * purchase() method that works in tandem with the charge() method in Card.  
 * 
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 * 
 */
public class Customer {
    
    private String name; 
    private Card card = new Card(null, 0, 0);
    private Random cardNumber = new Random();

    /**
     * Constructor for the Customer class.
     * Initializes a customer with the given name and generates a random card number.
     * 
     * @param newName The name of the customer.
     */
    public Customer(String newName){
        name = newName;
        card.setCardNumber(cardNumber.nextInt(100000000, 999999999));
    }

    /**
     * Sets the payment card for the customer.
     * 
     * @param newCard The new payment card for the customer.
     */
    public void setCard(Card newCard){
        card = newCard;
    }

    /**
     * Retrieves the payment card associated with the customer.
     * 
     * @return The payment card associated with the customer.
     */
    public Card getCard(){
        return card;
    }

    /**
     * Retrieves the card number associated with the customer's payment card.
     * 
     * @return The card number associated with the customer's payment card.
     */
    public int getCardNumber(){
        return card.getNumber();
    }

    /**
     * Retrieves the name of the customer.
     * 
     * @return The name of the customer.
     */
    public String getName(){
        return name;
    }

    /**
     * Sets the balance of the customer's payment card.
     * 
     * @param newBalance to set for the customer's payment card.
     */
    public void setBalance(int newBalance){
        card.setBalance(newBalance);
    }

    /**
     * Attempts to make a purchase using the customer's payment card.
     * 
     * @param item to purchase.
     * @return True if the purchase is successful, false if there are insufficient funds.
     */
    public boolean purchase(PC item) throws InsufficientFundsException{
        //set amount equal to price for readability and speed
        if(item.getPrice() > this.getCard().getBalance()){
            throw new InsufficientFundsException(this, item.getPrice());
        }else{
            this.getCard().charge(item.getPrice());
            return true;
        }
    }
}
