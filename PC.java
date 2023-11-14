import java.util.Random;

public class PC {

    private String motherboard;
    private String CPU;
    private String RAM;
    private String GPU;
    private String PSU;
    private String storage;
    private int price;
    private static int staticFrameNumber;
    private int frameNumber;
    
    public PC(){
        randomizeComponents();
        frameNumber = staticFrameNumber++;
    }

    public String getMotherboard(){
        return motherboard;
    }

    public String getCPU(){
        return CPU;
    }

    public String getRAM(){
        return RAM;
    }

    public String getGPU(){
        return GPU;
    }

    public String getPSU(){
        return PSU;
    }

    public String getStorage(){
        return storage;
    }

    public int getFrameNumber(){
        return frameNumber;
    }

    @Override
    public String toString(){
        return "Motherboard: " + motherboard + "\n" +
                "CPU: " + CPU + "\n" +
                "RAM: " + RAM + "\n" +
                "GPU: " + GPU + "\n" + 
                "PSU: " + PSU + "\n" +
                "Storage: " + storage + "\n" +
                "Price: " + price;

    }

    public void randomizeComponents(){
        Random number = new Random();
        int brandSelect = number.nextInt(2);
        motherboard = ComponentsList.moboList[brandSelect][number.nextInt(4)];
        CPU = ComponentsList.cpuList[brandSelect][number.nextInt(7)];
        GPU = ComponentsList.gpuList[brandSelect][number.nextInt(7)];
        RAM = ComponentsList.ramList[number.nextInt(4)];
        PSU = ComponentsList.psuList[number.nextInt(7)];
        storage = ComponentsList.storageList[number.nextInt(4)];
    }
}
