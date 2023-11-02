import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;

class View{
    public View(){
        JFrame frame = new JFrame("Joe Mama LOL");
        final int width = 800;
        final int height = 600;
        frame.setVisible(true);
        frame.pack();
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(3);

        JPanel computersContainer = new JPanel(new GridLayout(2, 4, 8, 6));
        JButton[] computers = new JButton[8];

        for(int index = 0; index < 8; index++){
            computers[index] = new JButton("PC " + (index+1));
            computersContainer.add(computers[index]);
        }

        JPanel northPanel = new JPanel(new GridLayout(1,3));
        JButton catalogButton = new JButton("PC Catalog");
        JButton configurator = new JButton("Configurator");
        JButton closeButton = new JButton("Close");
        northPanel.add(catalogButton);
        northPanel.add(configurator);
        northPanel.add(closeButton);
        northPanel.setBounds(0, 0, (width/2), 20);
        frame.add(northPanel, BorderLayout.NORTH);
        
        computersContainer.setSize(width, height);
        frame.add(computersContainer, BorderLayout.CENTER);
        
        JPanel bottomPanel = new JPanel();
        JButton addPC = new JButton("CONFIGURE NEW PC");
        bottomPanel.add(addPC, BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args){
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller();
    }
}