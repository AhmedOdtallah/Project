public class Admin extends Customer{    
    
    public Admin(){
        super("Admin");
        super.setCard(new Card(getName(), 1, 1000000000));
    }
}
