package java_qollanma;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabel1 {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Salom hammaga");

        Border border = BorderFactory.createLineBorder(Color.CYAN,8);
        ImageIcon image = new ImageIcon("rasm.png");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.blue);
        label.setFont(new Font("MV Boli", Font.PLAIN,45));
        label.setIconTextGap(50);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP);
//        label.setBounds(0,0,300,300);




        JFrame frame = new JFrame();
//        frame.setSize(500,500);
        frame.setVisible(true);
//        frame.setResizable(false);
//        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.add(label);
        frame.pack();

    }
}
