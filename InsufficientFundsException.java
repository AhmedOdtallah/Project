public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(int balance, int charge){
        super("Insufficient funds to charge: " + charge + ".\n Balance is: " + balance);
    }
}
