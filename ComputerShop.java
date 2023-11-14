public class ComputerShop {

    private PC[] computerCatalog = new PC[8]; 
    
    public ComputerShop(){
        for(int index = 0; index < 8; index++){
            computerCatalog[index] = new PC();
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
