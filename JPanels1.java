package java_qollanma;

import javax.swing.*;
import java.awt.*;

public class JPanels1 {
    public static void main(String[] args) {
        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(0,0,750,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0,250,750,250);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,500,750,250);



        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setBackground(Color.black);

        frame.add(whitePanel);
        frame.add(bluePanel);
        frame.add(redPanel);
//        whitePanel.setBounds(200,0,100,100);
//
//        frame.add(whitePanel);
//        whitePanel.setBounds(400,0,100,100);
//
//        frame.add(whitePanel);
//        whitePanel.setBounds(600,0,100,100);
//
//        frame.add(whitePanel);
//        whitePanel.setBounds(100,100,100,100);
//
//        frame.add(whitePanel);
//        whitePanel.setBounds(100,300,100,100);
//
//        frame.add(whitePanel);
//        whitePanel.setBounds(100,500,100,100);
//
//        frame.add(whitePanel);
//        whitePanel.setBounds(100,700,100,100);
//

    }
}
