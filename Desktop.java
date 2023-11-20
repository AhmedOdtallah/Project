import java.util.Random;

public class Desktop extends PC{
    
    private Component PSU;
    private Component motherboard;

    public Desktop(){
        super();
        PSU = new Component("", 0);
        motherboard = new Component("", 0);
        randomizeComponents();
        priceAccordingly();
    }

    public void setPSU(Component pSU) {
        PSU = pSU;
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
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(6);
        String component = ComponentsList.psuKeys.get(number);
        PSU.Copy(ComponentsList.psu.get(component));
        number = randomNumber.nextInt(5);
        component = ComponentsList.motherboardKeys.get(number);
        motherboard.Copy(ComponentsList.motherboards.get(component));
    }

    public static void main(String[] args){
        Component PSU = new Component("Not fuckin null", 100000);
        System.out.println(PSU.getName());
        Desktop desktop = new Desktop();
        System.out.println(desktop.toString());
    }
}
