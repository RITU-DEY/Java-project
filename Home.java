package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Cursor;

public class Home extends JFrame {
    JFrame f1;
    JLabel l1;
    JButton b1, b2, b3, b4;
    ImageIcon i1;

    public Home() {

        f1 = new JFrame();
        f1.setUndecorated(true);
        f1.setBounds(0, 0, 100, 100);

        i1 = new ImageIcon("image/logo.png");
        f1.setIconImage(i1.getImage());

        l1 = new JLabel();
        l1.setIcon(new ImageIcon("image/home.png"));
        Dimension size = l1.getPreferredSize();// ?????????????
        l1.setBounds(0, 0, size.width, size.height);

        b1 = new JButton("X");
        b1.setBounds(1320, 4, 30, 40);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setForeground(new Color(255, 255, 255));
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("-");
        b2.setBounds(1290, 4, 25, 30);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setForeground(new Color(255, 255, 255));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);

        b3 = new JButton("Get Started");
        b3.setBounds(350, 370, 400, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setForeground(new Color(0,0, 0));
        b3.setBackground(new Color(255, 255, 255));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);


        b4 = new JButton("Contribution");
        b4.setBounds(550, 430, 400, 40);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b4.setForeground(new Color(0, 0, 0));
        b4.setBackground(new Color(255, 255, 255));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(l1);

        f1.setSize(1366, 768);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b1) {
                    f1.setVisible(false);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b2) {
                    f1.setState(Frame.ICONIFIED);
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b3) {
                    new Login("textField1", "textField2");
                    f1.setVisible(false);

                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new Contribution();
                    f1.setVisible(false);
                }
            }
        });

    }

}
