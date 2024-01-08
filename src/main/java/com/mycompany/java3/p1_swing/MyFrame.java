package com.mycompany.java3.p1_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

    // JButton
    JButton button;
    JLabel label;

    public MyFrame() throws HeadlessException {

        ImageIcon icon = new ImageIcon("logo3.jpg");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);
        label.setText("Clicked!");

        button = new JButton();
        button.setBounds(200, 100, 250, 100);
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(null);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        button.setForeground(Color.RED);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == button) {
//            System.out.println("Ok");
//        }
//        System.out.println("asd...");
        label.setVisible(true);

    }

}
