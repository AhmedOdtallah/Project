import java.util.Random;

public class Customer {
    
    private String name; 
    private Card card = new Card(null, 0, 0);

    public Customer(String newName){
        name = newName;
        Random cardNumber = new Random();
        card.setCardNumber(cardNumber.nextInt(100000000, 999999999));
    }

    public void setCard(Card newCard){
        card = newCard;
    }

    public Card getCard(){
        return card;
    }

    public int getCardNumber(){
        return card.getNumber();
    }

    public String getName(){
        return name;
    }

    public void setBalance(int newBalance){
        card.setBalance(newBalance);
    }

    public boolean purchase(PC item){
        try {
            card.charge(item);
            return true;
        } catch (InsufficientFundsException e) {
            System.out.println(getName() + " doesn't have enough money to make a purchase!");
            return false;
        }
    }
}

