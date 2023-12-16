package src;
/**
 * The Component class represents a basic component with a name and a price. 
 * Also provides methods for retrieving and modifying the name and price of 
 * said component.
 *
 * @author Ahmed Odtallah
 * @version 1.0
 *
 */
public class Component {

    private String name = "Empty";
    private int price = 0;

    /**
     * No-arg constructor for Component class.
     * Initializes the component with default values.
     */
    public Component(){
        
    }

    /**
     * Parameterized constructor for Component class.
     * Initializes the component with the specified name and price.
     *
     * @param newName of the component.
     * @param newPrice of the component.
     */
    public Component(String newName, int newPrice){
        name = newName;
        price = newPrice;
    }

    /**
     * Retrieves the name of the component.
     *
     * @return The name of the component.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the price of the component.
     *
     * @return The price of the component.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the name of the component.
     *
     * @param newName of the component.
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Sets the price of the component.
     *
     * @param newPrice of the component.
     */
    public void setPrice(int newPrice) {
        price = newPrice;
    }

    /**
     * Copies the values from another Component object to this object.
     *
     * @param component object to copy values from.
     */
    public void copy(Component component){
        name = component.getName();
        price = component.getPrice();
    }
}
