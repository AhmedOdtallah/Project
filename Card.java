public class Card {

    String name;
    int cardNumber;
    int balance;

    public Card(String newName, int newNumber, int newBalance){
        name = newName;
        cardNumber = newNumber;
        balance = newBalance;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setCardNumber(int newNumber){
        cardNumber = newNumber;
    }

    public void setBalance(int newBalance){
        balance = newBalance;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return cardNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void charge(PC item) throws InsufficientFundsException{
        int amount = item.getPrice();
        if(amount > balance){
            throw new InsufficientFundsException(balance, amount);
        }else{
            balance -= amount;
        }
    }
}