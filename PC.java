import java.util.Random;

public class PC {

    private Component CPU;
    private Component RAM;
    private Component GPU;
    private Component storage;
    private int price;
    private static int staticFrameNumber;
    private int frameNumber;
    private int brandSelect;

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
        return price;
    }

    public void setPrice(int newPrice){
        price = newPrice;
    }

    public int getBrandSelection(){
        return brandSelect;
    }

    @Override
    public String toString(){
        return  "CPU: " + CPU.getName() + "\n" +
                "RAM: " + RAM.getName() + "\n" +
                "GPU: " + GPU.getName() + "\n" + 
                "Storage: " + storage.getName() + "\n" +
                "Price: " + price;
    }

    public void randomizeComponents(){
        Random number = new Random();
        brandSelect = number.nextInt(2);
        CPU = ComponentsList.cpuList[brandSelect][number.nextInt(7)];
        GPU = ComponentsList.gpuList[brandSelect][number.nextInt(8)];
        RAM = ComponentsList.ramList[number.nextInt(4)];
        storage = ComponentsList.storageList[number.nextInt(4)];
    }

    public int priceAccordingly(){
        price += CPU.getPrice() + GPU.getPrice() +
        RAM.getPrice() + storage.getPrice(); 
        return price;
    }
}
