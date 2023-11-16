public class Laptop extends PC {
    
    private static Component screenType = new Component("IPS", 150);
    private int batteryLife = 2;

    public Laptop(){
        super();
    }

    @Override
    public String toString(){
        return "Screen type: " + screenType.getName() + "\n" +
               "Battery Life: " + batteryLife + " hours\n" +
               super.toString();
    }

    @Override
    public int priceAccordingly(){
        super.priceAccordingly();
        setPrice(getPrice() + screenType.getPrice());
        return getPrice();
    }
}