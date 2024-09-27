package Classes;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Category2 {

    JFrame frame;
    JLabel label1, label2, label3, label4, ll3;
    JButton l1, l2, l3, l4;
    JButton p1, p2, p3;
    JButton b1, b2, b3, b4, b5, b6;
    ImageIcon i1;

    Category2(String textField1) {

        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        label1 = new JLabel();
        label1.setIcon(new ImageIcon("image/logo1.png"));
        Dimension size = label1.getPreferredSize();
        label1.setBounds(80, 10, size.width, size.height);

        b1 = new JButton("X");
        b1.setBounds(1320, 4, 30, 40);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("-");
        b2.setBounds(1290, 4, 25, 30);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);

        b3 = new JButton();
        b3.setIcon(new ImageIcon("image/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);

        label2 = new JLabel("Fast Food Cart");
        label2.setBounds(200, 30, 800, 80);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 50));

        label3 = new JLabel("Select your pizza ");
        label3.setBounds(205, 80, 500, 60);
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //// Catagories

        b4 = new JButton();
        b4.setIcon(new ImageIcon("image/BB.png"));
        b4.setBounds(60, 160, 300, 220);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setBackground(Color.white);
        
        l1 = new JButton("BBQ chicken pizza");
        l1.setBounds(60, 385, 300, 35);
        l1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l1.setFocusPainted(false);
        l1.setHorizontalAlignment(SwingConstants.LEFT);
        l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l1.setContentAreaFilled(false);
        l1.setBorderPainted(false);

        p1 = new JButton("BDT 499 tk");
        p1.setBounds(60, 422, 300, 35);
        p1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.setFocusPainted(false);
        p1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.setHorizontalAlignment(SwingConstants.LEFT);
        p1.setContentAreaFilled(false);
        p1.setBorderPainted(false);

        b5 = new JButton();
        b5.setIcon(new ImageIcon("image/Cheese.jpeg"));
        b5.setBounds(380, 160, 300, 220);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setBackground(Color.white);
        
        l2 = new JButton("Cheese pizza");
        l2.setBounds(380, 385, 300, 35);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l2.setHorizontalAlignment(SwingConstants.LEFT);
        l2.setFocusPainted(false);
        l2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l2.setContentAreaFilled(false);
        l2.setBorderPainted(false);

        p2 = new JButton("BDT 699 tk");
        p2.setBounds(380, 422, 300, 35);
        p2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p2.setFocusPainted(false);
        p2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p2.setHorizontalAlignment(SwingConstants.LEFT);
        p2.setContentAreaFilled(false);
        p2.setBorderPainted(false);

        b6 = new JButton();
        b6.setIcon(new ImageIcon("image/Meat.jpeg"));
        b6.setBounds(700, 160, 300, 220);
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setBackground(Color.white);
        
        
        l3 = new JButton("Meat pizza");
        l3.setBounds(700, 385, 300, 35);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        l3.setHorizontalAlignment(SwingConstants.LEFT);
        l3.setFocusPainted(false);
        l3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l3.setContentAreaFilled(false);
        l3.setBorderPainted(false);

        p3 = new JButton("BDT 899 tk");
        p3.setBounds(700, 422, 300, 35);
        p3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p3.setFocusPainted(false);
        p3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p3.setHorizontalAlignment(SwingConstants.LEFT);
        p3.setContentAreaFilled(false);
        p3.setBorderPainted(false);

       

        ll3 = new JLabel("User :" + " " + textField1);
        ll3.setBounds(1150, 50, 120, 25);
        ll3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        l4 = new JButton("Sign Out");
        l4.setBounds(1260, 50, 90, 25);
        l4.setFont(new Font("Segoe UI", Font.BOLD, 16));
        l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l4.setFocusPainted(false);
        l4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        l4.setContentAreaFilled(false);

        
        // adding lebel
        
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(ll3);
        

        // adding button
        
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
   

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
      

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
      

        // add

        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        // Action
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b1) {
                    frame.setVisible(false);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2) {
                    frame.setState(Frame.ICONIFIED);
                }

            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b3) {
                    new UserDashBoard(textField1);
                    frame.setVisible(false);
                }
            }
        });

        // Catagories

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new Option4(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l1) {
                    new Option4(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p1) {
                    new Option4(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    new Option5(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l2) {
                    new Option5(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p2) {
                    new Option5(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b6) {
                    new Option6(textField1);
                    frame.setVisible(false);
                }
            }
        });
        l3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l3) {
                    new Option6(textField1);
                    frame.setVisible(false);
                }
            }
        });
        p3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == p3) {
                    new Option6(textField1);
                    frame.setVisible(false);
                }
            }
        });

 

        l4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == l4) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

    }
}
