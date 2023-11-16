public class ComputerShop {

    private PC[] computerCatalog = new PC[8]; 
    
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

    public PC getPC(int selection){
        return computerCatalog[selection];
    }

    public String getPCSpecs(int selection){
        return computerCatalog[selection].toString();
    }
}
