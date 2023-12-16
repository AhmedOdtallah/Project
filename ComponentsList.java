

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Stores a collection of motherboards, CPUs, GPUs, RAM configurations, PSUs, 
 * storage options, and screen panels. Provide easy access to each category through HashMaps 
 * and key lists, where the key lists are selected and the corresponding HashMap key 
 * receives the input and gets imported to a component object.
 * 
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 * 
 */
public class ComponentsList {
    
    // There are 5 motherboards
    protected static HashMap<String, Component> motherboards = new HashMap<>(){{
        put("A620", new Component("A620", 150)); put("B650M", new Component("B650M", 175)); put("B650", new Component("B650", 200)); 
        put("X670", new Component("X670", 225)); put("X670E", new Component("X670E", 250));
    }};

    // There are 8 CPUs
    protected static HashMap<String, Component> cpus = new HashMap<>(){{
        put("7500F", new Component("7500F", 125)); put("7600", new Component("7600", 200)); put("7600X", new Component("7600X", 225)); 
        put("7700", new Component("7700", 300)); put("7700X", new Component("7700X",325)); put("7800X", new Component("7800X", 400)); 
        put("7800X3D", new Component("7800X3D", 425)); put("7950X", new Component("7950X", 500));
    }};


    // There are 6 GPUs
    protected static HashMap<String, Component> gpus = new HashMap<>(){{
        put("6700XT", new Component("6700XT",300)); put("7700XT", new Component("7700XT", 450)); put("6800XT", new Component("6800XT", 450)); 
        put("7800XT", new Component("7800XT",500)); put("7900XT", new Component("7900XT",600)); put("7900XTX", new Component("7900XTX",750)); 
    }};


    // There are 4 RAM configs
    protected static HashMap<String, Component> ram = new HashMap<>(){{
        put("DDR5 4800", new Component("DDR5 4800",80)); put("DDR5 5200", new Component("DDR5 5200",90)); put("DDR5 5600", new Component("DDR5 5600",100)); 
        put("DDR5 6000", new Component("DDR5 6000", 120));
    }};

    // There are 6 PSUs
    protected static HashMap<String, Component> psu = new HashMap<>(){{
        put("850 GOLD", new Component("850 GOLD",100)); put("1000 GOLD", new Component("1000 GOLD",125)); put("1000 PLATINUM", new Component("1000 PLATINUM",150)); 
        put("1500 GOLD", new Component("1500 GOLD",175)); put("1500 PLATINUM", new Component("1500 PLATINUM", 200)); put("1500 ELITE", new Component("1500 ELITE",225)); 
    }};

    // There is 4 storage options
    protected static HashMap<String, Component> storage = new HashMap<>(){{
        put("1 TB", new Component("1 TB",60)); put("2 TB", new Component("2 TB",120)); put("3 TB", new Component("3 TB",180)); 
        put("4 TB", new Component("4 TB",240)); 
    }};

    // There are 3 screen options
    protected static HashMap<String, Component> panels = new HashMap<>(){{
        put("OLED", new Component("OLED", 500)); put("IPS", new Component("IPS", 250)); put("TS", new Component("TS", 50));
    }};

    //Contains the names for each motherboard, where they will be randomly selected and plugged into the RandomizeComponents() method
    protected static ArrayList<String> motherboardKeys = new ArrayList<>(motherboards.keySet());

    //Contains the names for each CPU, where they will be randomly selected and plugged into the RandomizeComponents() method
    protected static ArrayList<String> cpuKeys = new ArrayList<>(cpus.keySet());

    //Contains the names for each GPU, where they will be randomly selected and plugged into the RandomizeComponents() method
    protected static ArrayList<String> gpuKeys = new ArrayList<>(gpus.keySet());

    //Contains the names for each RAM configuration, where they will be randomly selected and plugged into the RandomizeComponents() method
    protected static ArrayList<String> ramKeys = new ArrayList<>(ram.keySet());

    //Contains the names for each power supply, where they will be randomly selected and plugged into the RandomizeComponents() method
    protected static ArrayList<String> psuKeys = new ArrayList<>(psu.keySet());

    //Contains the names for each storage option, where they will be randomly selected and plugged into the RandomizeComponents() method
    protected static ArrayList<String> storageKeys = new ArrayList<>(storage.keySet());

    //Contains the names for each panel type, where they will be randomly selected and plugged into the RandomizeComponents() method
    protected static ArrayList<String> panelKeys = new ArrayList<>(panels.keySet());
}
