package src;

import java.util.Random;

/**
 * Desktop class IS-A PC child that HAS 2 new components added, psu and motherboard. 
 * The class also provides methods to randomly select components and price the PC 
 * accordingly at creation, also provides methods to access and modify the two new 
 * components within the object. Overrides randomizeComponents(), toString() and 
 * pcType() from the parent class.
 * 
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 * 
 */
public class Desktop extends PC {
    
    private Component PSU = new Component();
    private Component motherboard = new Component();
    
    /**
     * Default constructor for the Desktop class.
     * Initializes a desktop with random components and calculates the price accordingly.
     */
    public Desktop(){
        super();
        randomizeComponents();
        priceAccordingly();
    }

    /**
     * Sets the PSU (Power Supply Unit) component for the desktop.
     * 
     * @param psu component for the desktop.
     */
    public void setPSU(Component psu) {
        PSU = psu;
    }

    /**
     * Sets the motherboard component for the desktop.
     * 
     * @param motherboard component for the desktop.
     */
    public void setMotherboard(Component motherboard) {
        this.motherboard = motherboard;
    }

    /**
     * Retrieves the PSU component of the desktop.
     * 
     * @return The PSU component of the desktop.
     */
    public Component getPSU(){
        return PSU;
    }

    /**
     * Retrieves the motherboard component of the desktop.
     * 
     * @return The motherboard component of the desktop.
     */
    public Component getMotherboard(){
        return motherboard;
    }

    /**
     * Overrides the method to randomize desktop-specific components.
     * Randomly selects and sets the PSU and motherboard components.
     */
    @Override
    public void randomizeComponents(){
        super.randomizeComponents();
        Random randomNumber = new Random();
        // Get Random PSU
        int number = randomNumber.nextInt(6);
        String component = ComponentsList.psuKeys.get(number);
        PSU = ComponentsList.psu.get(component);
        // Get Random Mobo
        number = randomNumber.nextInt(5);
        component = ComponentsList.motherboardKeys.get(number);
        motherboard = ComponentsList.motherboards.get(component);
    }
    
    /**
     * Overrides the method to generate a string representation of the desktop.
     * 
     * @return A string representation of the desktop, including PSU and motherboard information.
     */
    @Override
    public String toString(){
        return "PSU: " + PSU.getName() + "\n" +
               "Motherboard: " + motherboard.getName() + "\n" + 
               super.toString();
    }

    /**
     * Overrides the method to specify the PC type as "Desktop".
     * 
     * @return The PC type as "Desktop".
     */
    @Override
    public String pcType() {
        return "Desktop";
    }
}
