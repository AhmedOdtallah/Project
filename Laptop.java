import java.util.Random;

public class Laptop extends PC {
    
    private Component screen = new Component();
    private int batteryLife;

    public Laptop(){
        super();
        randomizeComponents();
        priceAccordingly();
    }

    public void setPanel(Component panel) {
        screen = panel;
    }

    public void setBatteryLife(int newLife) {
        batteryLife = newLife;
    }

    public Component getScreen(){
        return screen;
    }

    public int getBatteryLife(){
        return batteryLife;
    }

    @Override
    public void randomizeComponents(){
        super.randomizeComponents();
        Random randomNumber = new Random();
        //Get Random Panel type
        int number = randomNumber.nextInt(3);
        String component = ComponentsList.panelKeys.get(number);
        screen = ComponentsList.panels.get(component);
        //Get Random battery life
        batteryLife = randomNumber.nextInt(2,9);
    }

    @Override
    public String toString(){
        return "Panel: " + screen.getName() + "\n" +
               "Battery Life: " + batteryLife + "\n" + 
               super.toString();
    }

    @Override
    public String pcType() {
        return "Laptop";
    }
}