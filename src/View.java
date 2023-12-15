package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The view class IS-A JFrame child responsible for providing a View() object with which a GUI for the computer
 * shop will be made. This view handles button logic and front end interaction for the user, and passes 
 * all logic to the respective objects for modelling. Class also displays all GUI short of JOptionPanes and 
 * message dialogs that are called elsewhere in the project. The view also allows you to swap between the 
 * catalog and the simulation field, where customer interaction will be showed within a JTextArea.
 *  
 * @author Ahmed-Hassan Odtallah
 * @version 1.0
 * 
 */
public class View{
    
    private JFrame frame = new JFrame("The CFG Shop");
    
    private JPanel computersContainer = new JPanel(new GridLayout(2,4,15,15));
    private JPanel northPanel = new JPanel();
    private JPanel bottomPanel = new JPanel();
    private JPanel simulatePanel = new JPanel();
    
    private JButton[] computerButtons = new JButton[8];
    private JButton catalogButton = new JButton("PC CATALOG");
    private JButton simulateButton = new JButton("SIMULATE");
    private JButton CLOSE = new JButton("CLOSE");
    
    private JTextField simulationField = new JTextField("Sim start...\n");
    
    private ComputerShop catalog = new ComputerShop();
    
    /**
     * Constructor for the View class.
     * Initializes the graphical user interface components.
     */
    public View(){
        
        frame.setIconImage(new ImageIcon("PCIcons\\icon1.jpg").getImage());
        
        //If simulate is clicked, hide catalog and show simulation
        simulateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                computersContainer.setVisible(false);
                simulatePanel.setVisible(true);
            }
        });
        
        //If catalog is clicked, hide simulation and show catalog
        catalogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                simulatePanel.setVisible(false);
                computersContainer.setVisible(true);
            }
        });
        
        //If close is clicked, shut down program and kill threads.
        CLOSE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        
        final int width = 1200;
        final int height = 700;
        
        frame.setVisible(true);
        frame.pack();
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create all the computerButtons necessary for the catalog
        for(int index = 0; index < 8; index++){
            computerButtons[index] = new JButton("PC " + (index+1));
            computersContainer.add(computerButtons[index]);
            computerButtons[index].addActionListener(new ComputerButtonListener(catalog.getPC(index)));
            //Grab the corresponding image. TO-DO: Randomize PC images
            computerButtons[index].setIcon(new ImageIcon("PCIcons\\icon" + index + ".jpg"));
            computerButtons[index].setBackground(new Color(255,255,255));
        }
        
        northPanel.add(catalogButton);
        northPanel.add(simulateButton);
        northPanel.setBounds(0, 0, (width/2), 20);
        frame.add(northPanel, BorderLayout.NORTH);
        
        simulatePanel.setSize(width, height);
        simulatePanel.add(simulationField);
        frame.add(simulatePanel, BorderLayout.CENTER);
        simulatePanel.setVisible(false);
        
        computersContainer.setSize(width, height);
        frame.add(computersContainer, BorderLayout.CENTER);
        
        bottomPanel.add(CLOSE);
        frame.add(bottomPanel, BorderLayout.SOUTH);
    }
    
    /**
     * Retrieves the PC from the catalog based on the given number.
     * 
     * @param number The PC number to retrieve from the catalog.
     * @return The PC from the catalog.
     */
    public PC getComputer(int number){
        return catalog.getPC(number);
    }
    
    /**
     * Appends a message to the simulation field.
     * 
     * @param message The message to be added to the simulation field.
     */
    public void addToJTextField(String message){
        simulationField.setText(simulationField.getText() + "\n" + message + "\n");
    }
}
