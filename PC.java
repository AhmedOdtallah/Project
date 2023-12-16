

import java.util.Random;
import javax.swing.ImageIcon;

/**
 * The PC class represents an abstract computer, serving as a base for specific PC types (Desktop and Laptop). 
 * Provides methods to access and modify all general PC components, along with methods to set its price, or
 * reprice the PC if called. Also contains a toString() method that prints out the specifications of this
 * generalized type. This class also contains the randomizeComponents() and priceAccordingly() methods,
 * which are overidden in the child classes, and also features an abstract pcType() that must be implemented
 * in all child classes.
 * 
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 * 
 */
public abstract class PC {
    
    private Component CPU = new Component();
    private Component RAM = new Component();
    private Component GPU = new Component();
    private Component storage = new Component();
    private int totalPrice;
    private static int staticFrameNumber;
    private int frameNumber;
    private Random randomNumber = new Random();
    private ImageIcon pcIcon = null;

    /**
     * Constructor for the PC class.
     * Initializes a PC with random components and calculates the price accordingly.
     */
    public PC(){
        randomizeComponents();
        priceAccordingly();
        frameNumber = staticFrameNumber++;
    }

    /**
     * Retrieves the CPU component of the PC.
     * 
     * @return The CPU component of the PC.
     */
    public String getCPU(){
        return CPU.getName();
    }

    /**
     * Retrieves the RAM component of the PC.
     * 
     * @return The RAM component of the PC.
     */
    public String getRAM(){
        return RAM.getName();
    }

    /**
     * Retrieves the GPU component of the PC.
     * 
     * @return The GPU component of the PC.
     */
    public String getGPU(){
        return GPU.getName();
    }

    /**
     * Retrieves the storage component of the PC.
     * 
     * @return The storage component of the PC.
     */
    public String getStorage(){
        return storage.getName();
    }

    /**
     * Retrieves the frame number of the PC.
     * 
     * @return The frame number of the PC.
     */
    public int getFrameNumber(){
        return frameNumber;
    }

    /**
     * Retrieves the total price of the PC.
     * 
     * @return The total price of the PC.
     */
    public int getPrice() {
        return totalPrice;
    }

    /**
     * Sets the total price of the PC.
     * 
     * @param newPrice The new total price to set for the PC.
     */
    public void setPrice(int newPrice){
        totalPrice = newPrice;
    }

    /**
     * Retrieves the total price of the PC.
     * 
     * @return The total price of the PC.
     */
    public ImageIcon getIcon() {
        return pcIcon;
    }

    /**
     * Sets the total price of the PC.
     * 
     * @param newIcon The new icon to set for the PC.
     */
    public void setIcon(ImageIcon newIcon){
        pcIcon = newIcon;
    }

    /**
     * Generates a string representation of the PC.
     * 
     * @return A string representation of the PC, including components and price.
     */
    @Override
    public String toString(){
        return  "CPU: " + CPU.getName() + "\n" +
                "RAM: " + RAM.getName() + "\n" +
                "GPU: " + GPU.getName() + "\n" + 
                "Storage: " + storage.getName() + "\n" +
                "Price: " + totalPrice;
    }

    /**
     * Randomly selects and sets components for the PC.
     */
    public void randomizeComponents(){
        //Randomly select a CPU
        int number = randomNumber.nextInt(8);
        String component = ComponentsList.cpuKeys.get(number);
        CPU.copy(ComponentsList.cpus.get(component));
        //Randomly select RAM
        number = randomNumber.nextInt(4);
        component = ComponentsList.ramKeys.get(number);
        RAM.copy(ComponentsList.ram.get(component));
        //Randomly select a GPU
        number = randomNumber.nextInt(4);
        component = ComponentsList.gpuKeys.get(number);
        GPU.copy(ComponentsList.gpus.get(component));
        //Randomly select a storage option
        number = randomNumber.nextInt(4);
        component = ComponentsList.storageKeys.get(number);
        storage.copy(ComponentsList.storage.get(component));
    }

    /**
     * Calculates the total price of the PC based on its components.
     * 
     * @return The total price of the PC.
     */
    public int priceAccordingly(){
        totalPrice += CPU.getPrice() + GPU.getPrice() +
        RAM.getPrice() + storage.getPrice(); 
        return totalPrice;
    }

    /**
     * Abstract method to specify the type of the PC.
     * 
     * @return The type of the PC as a string.
     */
    public abstract String pcType();
}
