package src;

import java.util.Random;

/**
 * The laptop class IS-A PC and HAS-A new component and spec, the screen and battery life.
 * Also features the overridden randomizeComponents() method, which randomizes components and prices
 * them accordingly at runtime. This class provides methods to access and modify its fields, 
 * and overrides the randomizeComponents(), toString(), and pcType() methods in the PC parent class.
 * 
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 * 
 */
public class Laptop extends PC {
    
    private Component screen = new Component();
    private int batteryLife;
    
    /**
     * Default constructor for the Laptop class.
     * Initializes a laptop with random components and calculates the price accordingly.
     */
    public Laptop(){
        super();
        randomizeComponents();
        priceAccordingly();
    }

    /**
     * Sets the screen component for the laptop.
     * 
     * @param panel screen component for the laptop.
     */
    public void setPanel(Component panel) {
        screen = panel;
    }

    /**
     * Sets the battery life for the laptop.
     * 
     * @param newLife The new battery life for the laptop.
     */
    public void setBatteryLife(int newLife) {
        batteryLife = newLife;
    }

    /**
     * Retrieves the screen component of the laptop.
     * 
     * @return The screen component of the laptop.
     */
    public Component getScreen(){
        return screen;
    }

    /**
     * Retrieves the battery life of the laptop.
     * 
     * @return The battery life of the laptop.
     */
    public int getBatteryLife(){
        return batteryLife;
    }

    /**
     * Overrides the method to randomize laptop-specific components.
     * Randomly selects and sets the screen component and battery life.
     */
    @Override
    public void randomizeComponents(){
        super.randomizeComponents();
        Random randomNumber = new Random();
        // Get Random Panel type
        int number = randomNumber.nextInt(3);
        String component = ComponentsList.panelKeys.get(number);
        screen = ComponentsList.panels.get(component);
        // Get Random battery life
        batteryLife = randomNumber.nextInt(2,9);
    }

    /**
     * Overrides the method to generate a string representation of the laptop.
     * 
     * @return A string representation of the laptop, including screen and battery life information.
     */
    @Override
    public String toString(){
        return "Panel: " + screen.getName() + "\n" +
               "Battery Life: " + batteryLife + "\n" + 
               super.toString();
    }

    /**
     * Overrides the method to specify the PC type as "Laptop".
     * 
     * @return The PC type as "Laptop".
     */
    @Override
    public String pcType() {
        return "Laptop";
    }
}
