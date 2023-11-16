public class TestProject extends Thread{
    static View view;
    public static void main(String[] args){
        view = new View();
        TestProject project = new TestProject();
        project.start();
    }

    public void run(){
        for(int i = 0; i < 10; i++){
            view.addToJTextField("\n");
        }
    }
}
