import java.util.Random;

public class Desktop extends PC{
    
    private Component PSU = new Component();
    private Component motherboard = new Component();

    public Desktop(){
        super();
        randomizeComponents();
        priceAccordingly();
    }

    public void setPSU(Component psu) {
        PSU = psu;
    }

    public void setMotherboard(Component motherboard) {
        this.motherboard = motherboard;
    }

    public Component getPSU(){
        return PSU;
    }

    public Component getMotherboard(){
        return motherboard;
    }

    @Override
    public void randomizeComponents(){
        super.randomizeComponents();
        Random randomNumber = new Random();
        //Get Random PSU
        int number = randomNumber.nextInt(6);
        String component = ComponentsList.psuKeys.get(number);
        PSU = ComponentsList.psu.get(component);
        //Get Random Mobo
        number = randomNumber.nextInt(5);
        component = ComponentsList.motherboardKeys.get(number);
        motherboard = ComponentsList.motherboards.get(component);
    }

    @Override
    public String toString(){
        return "PSU: " + PSU.getName() + "\n" +
               "Motherboard: " + motherboard.getName() + "\n" + 
               super.toString();
    }

    @Override
    public String pcType() {
        return "Desktop";
    }
}
