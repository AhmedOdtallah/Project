import java.io.*;
import javax.swing.*;
import java.awt.*;
// import PCIcons.IconList;
class View{
    public View(){

        JFrame frame = new JFrame("The CFG Shop");
        frame.setIconImage(new ImageIcon("PCIcons\\icon1.jpg").getImage());
        JPanel computersContainer = new JPanel(new GridLayout(2,4,15,15));
        JPanel northPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        JButton[] computerButtons = new JButton[8];
        JButton catalogButton = new JButton("PC Catalog");
        JButton configurator = new JButton("Configurator");
        JButton BUY = new JButton("BUY");
        
        ComputerShop catalog = new ComputerShop();

        final int width = 800;
        final int height = 600;
        frame.setVisible(true);
        frame.pack();
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(3);


        for(int index = 0; index < 8; index++){
            computerButtons[index] = new JButton("PC " + (index+1));
            computersContainer.add(computerButtons[index]);
            computerButtons[index].addActionListener(new ComputerButtonListener(catalog.getPC(index)));
        }

        northPanel.add(catalogButton);
        northPanel.add(configurator);
        northPanel.setBounds(0, 0, (width/2), 20);
        frame.add(northPanel, BorderLayout.NORTH);
        
        computersContainer.setSize(width, height);
        frame.add(computersContainer, BorderLayout.CENTER);
        
        bottomPanel.add(BUY, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args){
        View view = new View();
        Model model = new Model();
    }
}