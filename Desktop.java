import java.util.Random;

public class Desktop extends PC {
    
    private Component PSU;
    private Component motherboard;
    
    public Desktop(){
        super();
    }

    public String getMotherboard(){
        return motherboard.getName();
    }

    public String getPSU(){
        return PSU.getName();
    }

    public String toString(){
        return "Motherboard: " + motherboard.getName() + "\n" + 
               "Power supply: " + PSU.getName() + "\n" + 
               super.toString();
    }

    @Override
    public void randomizeComponents() {
        Random number = new Random();
        super.randomizeComponents();
        PSU = ComponentsList.psu.get(number);
        motherboard = ComponentsList.moboList[getBrandSelection()][number.nextInt(4)];
    }

    @Override
    public int priceAccordingly(){
        setPrice(super.priceAccordingly() + motherboard.getPrice() + PSU.getPrice());
        return getPrice();
    }



}