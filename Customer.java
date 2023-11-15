public class Customer {
    
    private String name; 
    private int cardNumber;

    public Customer(String newName){
        name = newName;
    }

    public void setCardNumber(int newCardNumber){
        cardNumber = newCardNumber;
    }

    public int getCardNumber(){
        return cardNumber;
    }

    public String getName(){
        return name;
    }
}
