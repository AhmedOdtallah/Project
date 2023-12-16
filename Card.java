

/**
 * The Card class represents an object with customer information
 * that a customer will need to begin and complete purchases. Provides methods for retrieving
 * and modifying the name, number, and balance for the card, along with a charge method 
 * to purchase computers with.
 * 
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 * 
 */

public class Card {

    private String name;
    private int cardNumber;
    private int balance;
    private int amount;

    /**
     * Constructor for a Card object. Takes in a name, number, and balance
     * as parameters and creates the object to be associated with a customer.
     * @param newName
     * @param newNumber
     * @param newBalance
     */
    public Card(String newName, int newNumber, int newBalance){
        name = newName;
        cardNumber = newNumber;
        balance = newBalance;
    }

    
    /** 
     * @param newName
     */
    public void setName(String newName){
        name = newName;
    }

    
    /** 
     * @param newNumber
     */
    public void setCardNumber(int newNumber){
        cardNumber = newNumber;
    }

    
    /** 
     * @param newBalance
     */
    public void setBalance(int newBalance){
        balance = newBalance;
    }

    /**
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * @return card number
     */
    public int getNumber(){
        return cardNumber;
    }

    /**
     * @return balance
     */
    public int getBalance(){
        return balance;
    }

    /**
     * Charges a customer for the PC object they are attempting to buy.
     * @param amount
     */
    public void charge(int amount){
        balance -= amount;
    }
}