package com.mycompany.java3.p1_swing;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SwingDemo extends JFrame{

//    public SwingDemo() {
//        this.setSize(420, 420);
//        this.setTitle("basic frame demo");
//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
//    }



    public static void main(String[] args) {

        JFrame frame = new SwingDemo();
        frame.setSize(420, 420);
        frame.setTitle("basic frame demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(Color.GRAY);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.getContentPane().setBackground(new Color(0xFFFFFF));
    }
}
