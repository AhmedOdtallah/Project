public class PC {

    String motherboard;
    String CPU;
    String RAM;
    String GPU;
    String PSU;
    String storage;
    int price;
    
    public PC(String newMobo, String newCPU, String newRAM, String newGPU, String newPSU, String newStorage){
        motherboard = newMobo;
        CPU = newCPU;
        RAM = newRAM;
        GPU = newGPU;
        PSU = newPSU;
        storage = newStorage;
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
}
