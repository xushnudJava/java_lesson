package java_qollanma;

import javax.swing.*;
import java.awt.*;

public class GUI_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setResizable(false);

        frame.setTitle("--> frame nomi <--");

        frame.setSize(500,500);

        frame.setVisible(true);

        ImageIcon icon = new ImageIcon("rasm.png");

        frame.setIconImage(icon.getImage());

        frame.getContentPane().setBackground(Color.RED);


    }
}
