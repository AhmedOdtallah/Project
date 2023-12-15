package src;

/**
 * This class HAS multiple PCs in a catalog, including both desktops and laptops, 
 * providing methods to retrieve specific PC objects and their specifications. Creates 
 * the catalog at runtime with 8 PC's: 4 dekstops and 4 laptops, each containing 
 * randomly generated components. 
 * 
 * @author John Doe
 * @version 1.0
 * 
 */
public class ComputerShop {

    //
    private PC[] computerCatalog = new PC[8]; 
    
    /**
     * Default constructor for the ComputerShop class.
     * Initializes the catalog with four desktops and four laptops, each with randomly generated components.
     */
    public ComputerShop(){
        for(int index = 0; index < 4; index++){
            computerCatalog[index] = new Desktop();
            computerCatalog[index].randomizeComponents();
        }
        for(int index = 4; index < 8; index++){
            computerCatalog[index] = new Laptop();
            computerCatalog[index].randomizeComponents();
        }
    }

    /**
     * Retrieves a specific PC from the catalog.
     * 
     * @param selection The index of the PC in the catalog.
     * @return The PC at the specified index.
     */
    public PC getPC(int selection){
        return computerCatalog[selection];
    }

    /**
     * Retrieves the specifications of a specific PC from the catalog.
     * 
     * @param selection The index of the PC in the catalog.
     * @return A string representation of the specifications of the PC.
     */
    public String getPCSpecs(int selection){
        return computerCatalog[selection].toString();
    }
}
