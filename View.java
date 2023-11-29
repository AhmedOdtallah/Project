import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class View{
    private JFrame frame = new JFrame("The CFG Shop");
    
    private JPanel computersContainer = new JPanel(new GridLayout(2,4,15,15));
    private JPanel northPanel = new JPanel();
    private JPanel bottomPanel = new JPanel();
    private JPanel simulatePanel = new JPanel();
    
    private JButton[] computerButtons = new JButton[8];
    private JButton catalogButton = new JButton("PC CATALOG");
    private JButton simulateButton = new JButton("SIMULATE");
    private JButton CLOSE = new JButton("CLOSE");
    
    private JTextArea simulationField = new JTextArea("Sim start...\n");

    private ComputerShop catalog = new ComputerShop();

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
        
        final int width = 1050;
        final int height = 700;
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

    public PC getComputer(int number){
        return catalog.getPC(number);
    }

    public void addToJTextField(String message){
        simulationField.append(message + "\n");
    }
}