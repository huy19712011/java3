package com.mycompany.java3.p1_swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabelDemo {

    public static void main(String[] args) {
        // JLabel: text, image

        ImageIcon image = new ImageIcon("logo2.png");
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

        JLabel label = new JLabel();
        label.setText("Hello from JLabel");
        label.setIcon(image);

        label.setHorizontalAlignment(JLabel.CENTER); // LEFT, RIGHT
        label.setVerticalTextPosition(JLabel.CENTER);

        label.setForeground(Color.RED);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        label.setIconTextGap(50);
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);

        label.setBorder(border);


        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);

        label.setBounds(0, 0, 250, 250);


        JFrame frame = new JFrame("JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(label);
    }
}
