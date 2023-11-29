import java.util.Random;

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
        Customer[] customers = new Customer[10];
        for(int i = 0; i < 10; i++){
            
            Customer customer = new Customer("Customer " + (i+1));
            
            customers[i] = customer;

            view.addToJTextField(customer.getName() + " walked in!");
            
            try {
                Thread.sleep(waitTime.nextInt(1000,10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(waitTime.nextInt(1) == 1){
                customers[waitTime.nextInt(10)].purchase(view.getComputer(waitTime.nextInt(8)));
                System.out.println("PC bought!");
            }
        }
    }
}
