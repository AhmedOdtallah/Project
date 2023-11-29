import java.util.Random;
import java.util.ArrayList;

public class TestProject extends Thread{
    private static View view;
    protected static final Admin admin = new Admin();
    public static void main(String[] args){
        view = new View();
        TestProject project = new TestProject();
        project.start();
    }

    public void run(){
        Random waitTime = new Random();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        for(int i = 0; i < 10; i++){
            
            Customer customer = new Customer("Customer " + (i+1));
            customer.setBalance(waitTime.nextInt(1000,5000));
            
            customers.add(customer);

            view.addToJTextField(customer.getName() + " walked in!");
            
            try {
                Thread.sleep(waitTime.nextInt(1000,1001));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        while(customers.size() > 0){
            int grabRandomCustomer = waitTime.nextInt(customers.size());
            Customer customer = customers.get(grabRandomCustomer);
            while(customers.get(grabRandomCustomer) == null){
                grabRandomCustomer = waitTime.nextInt(customers.size());
                customer = customers.get(grabRandomCustomer);
            }
            int randomPC = waitTime.nextInt(8);

            if(customer.purchase(view.getComputer(randomPC)) != false){
                System.out.println( view.getComputer(randomPC).pcType() + " bought by: " + customer.getName());
            }
            System.out.println(customer.getName() + " walked out!");
            customers.remove(grabRandomCustomer);
            System.out.println(customers.size());
        }
    }
}
