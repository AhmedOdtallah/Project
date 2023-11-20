public class Component {

    private String name = "Empty";
    private int price = 0;

    public Component(){
        
    }

    public Component(String newName, int newPrice){
        name = newName;
        price = newPrice;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public void Copy(Component component){
        name = component.getName();
        price = component.getPrice();
    }
}
