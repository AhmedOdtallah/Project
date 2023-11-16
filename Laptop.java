public class Laptop extends PC {
    
    Component screenType = new Component("OLED", 200);
    private int batteryLife;
    
    public Laptop(){
        super();
    }

    public String getScreenType(){
        return screenType.getName();
    }

    public int getBatteryLife(){
        return batteryLife;
    }

    // public void selectScreenType(){
    //     screenType = new Component("OLED", 200);
    // }

    @Override
    public String toString(){
        return "Screen type: " + screenType + "\n" + 
               "Battery life: " + batteryLife + "\n" +
               super.toString();
    }

    @Override
    public int priceAccordingly(){
        setPrice((super.getPrice()+screenType.getPrice()));
        return getPrice();
    }
}
