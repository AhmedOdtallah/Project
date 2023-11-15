import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class View{
    JFrame frame = new JFrame("The CFG Shop");
    
    JPanel computersContainer = new JPanel(new GridLayout(2,4,15,15));
    JPanel northPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JPanel simulatePanel = new JPanel();
    
    JButton[] computerButtons = new JButton[8];
    JButton catalogButton = new JButton("PC CATALOG");
    JButton simulateButton = new JButton("SIMULATE");
    JButton CLOSE = new JButton("CLOSE");
    
    JTextArea simulationField = new JTextArea("Simulation field...");

    ComputerShop catalog = new ComputerShop();

    static String text;

    public View(){
        
        frame.setIconImage(new ImageIcon("PCIcons\\icon1.jpg").getImage());
        simulateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                computersContainer.setVisible(false);
                simulatePanel.setVisible(true);
            }
        });
        
        catalogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                simulatePanel.setVisible(false);
                computersContainer.setVisible(true);
            }
        });

        CLOSE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        
        final int width = 1250;
        final int height = 800;
        frame.setVisible(true);
        frame.pack();
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(3);

        for(int index = 0; index < 8; index++){
            computerButtons[index] = new JButton("PC " + (index+1));
            computersContainer.add(computerButtons[index]);
            computerButtons[index].addActionListener(new ComputerButtonListener(catalog.getPC(index)));
            computerButtons[index].setIcon(new ImageIcon("PCIcons\\icon" + index + ".jpg"));
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

        bottomPanel.add(CLOSE, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);

    }

    public void addToJTextField(String message){
        text += message + "\n";
        simulationField.append(message);
    }
}