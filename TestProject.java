public class TestProject extends Thread{
    static View view;
    public static void main(String[] args){
        view = new View();
        TestProject project = new TestProject();
        project.start();
    }

    public void run(){
        do{
            try{
                view.addToJTextField("deez\n");
                Thread.sleep(1000);
            }catch(InterruptedException e){
    
            }
        }while(1==1);
    }
}
