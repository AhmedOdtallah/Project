import java.util.HashMap;

public class ComponentsList {
    
    private HashMap<String, Integer> motherboards = new HashMap<>(){{
        put("A620", 150); put("B650M", 175); put("B650", 200); 
        put("X670", 225); put("X670E", 250);
    }};

    private HashMap<String, Integer> cpus = new HashMap<>(){{
        put("7500F", 125); put("7600", 200); put("7600X", 225); 
        put("7700", 300); put("7700X",325); put("7800X", 400); 
        put("7800X3D", 425); put("7950X", 500);
    }};

    private HashMap<String, Integer> gpus = new HashMap<>(){{
        put("6700XT",300); put("7700XT", 450); put("6800XT", 450); 
        put("7800XT",500); put("7900XT",600); put("7900XTX",750); 
    }};

    private HashMap<String, Integer> ram = new HashMap<>(){{
        put("DDR5 4800",80); put("DDR5 5200",90); put("DDR5 5600",100); 
        put("DDR5 6000", 120);
    }};

    private HashMap<String, Integer> psu = new HashMap<>(){{
        put("850 GOLD",100); put("1000 GOLD",125); put("1000 PLATINUM",150); 
        put("1500 GOLD",175); put("1500 PLATINUM", 200); put("1500 ELITE",225); 
    }};

    private HashMap<String, Integer> storage = new HashMap<>(){{
        put("1 TB",60); put("2 TB",120); put("3 TB",180); 
        put("4 TB",240); 
    }};


}
