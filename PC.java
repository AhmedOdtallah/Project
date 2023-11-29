import java.util.Random;

public abstract class PC {

    private Component CPU = new Component();
    private Component RAM = new Component();
    private Component GPU = new Component();
    private Component storage = new Component();
    private int totalPrice;
    private static int staticFrameNumber;
    private int frameNumber;

    public PC(){
        randomizeComponents();
        priceAccordingly();
        frameNumber = staticFrameNumber++;
    }

    public String getCPU(){
        return CPU.getName();
    }

    public String getRAM(){
        return RAM.getName();
    }

    public String getGPU(){
        return GPU.getName();
    }

    public String getStorage(){
        return storage.getName();
    }

    public int getFrameNumber(){
        return frameNumber;
    }

    public int getPrice() {
        return totalPrice;
    }

    public void setPrice(int newPrice){
        totalPrice = newPrice;
    }

    @Override
    public String toString(){
        return  "CPU: " + CPU.getName() + "\n" +
                "RAM: " + RAM.getName() + "\n" +
                "GPU: " + GPU.getName() + "\n" + 
                "Storage: " + storage.getName() + "\n" +
                "Price: " + totalPrice;
    }

    public void randomizeComponents(){
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(8);
        String component = ComponentsList.cpuKeys.get(number);
        CPU.Copy(ComponentsList.cpus.get(component));
        number = randomNumber.nextInt(4);
        component = ComponentsList.ramKeys.get(number);
        RAM.Copy(ComponentsList.ram.get(component));
        number = randomNumber.nextInt(4);
        component = ComponentsList.gpuKeys.get(number);
        GPU.Copy(ComponentsList.gpus.get(component));
        number = randomNumber.nextInt(4);
        component = ComponentsList.storageKeys.get(number);
        storage.Copy(ComponentsList.storage.get(component));
    }

    public int priceAccordingly(){
        totalPrice += CPU.getPrice() + GPU.getPrice() +
        RAM.getPrice() + storage.getPrice(); 
        return totalPrice;
    }

    public abstract String pcType();
}
