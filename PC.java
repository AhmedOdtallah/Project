import java.util.Random;

public class PC {

    private Component motherboard;
    private Component CPU;
    private Component RAM;
    private Component GPU;
    private Component PSU;
    private Component storage;
    private int price;
    private static int staticFrameNumber;
    private int frameNumber;
    
    public PC(){
        randomizeComponents();
        priceAccordingly();
        frameNumber = staticFrameNumber++;
    }

    public String getMotherboard(){
        return motherboard.getName();
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

    public String getPSU(){
        return PSU.getName();
    }

    public String getStorage(){
        return storage.getName();
    }

    public int getFrameNumber(){
        return frameNumber;
    }

    @Override
    public String toString(){
        return "Motherboard: " + motherboard.getName() + "\n" +
                "CPU: " + CPU.getName() + "\n" +
                "RAM: " + RAM.getName() + "\n" +
                "GPU: " + GPU.getName() + "\n" + 
                "PSU: " + PSU.getName() + "\n" +
                "Storage: " + storage.getName() + "\n" +
                "Price: " + price;

    }

    public void randomizeComponents(){
        Random number = new Random();
        int brandSelect = number.nextInt(2);
        motherboard = ComponentsList.moboList[brandSelect][number.nextInt(4)];
        CPU = ComponentsList.cpuList[brandSelect][number.nextInt(7)];
        GPU = ComponentsList.gpuList[brandSelect][number.nextInt(8)];
        RAM = ComponentsList.ramList[number.nextInt(4)];
        PSU = ComponentsList.psuList[number.nextInt(8)];
        storage = ComponentsList.storageList[number.nextInt(4)];
    }

    public void priceAccordingly(){
        price += motherboard.getPrice() + CPU.getPrice() + GPU.getPrice() +
        RAM.getPrice() + PSU.getPrice() + storage.getPrice(); 
    }
}
