package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminDashBoard extends JFrame {

    JFrame frame;
    JPanel panel1, panel2;
    JLabel l1, l2, l3;
    JButton b1, b2, b3, b4, b5, b6;
    JButton pl1, pl2 ;
    ImageIcon i1;

    AdminDashBoard(String textField1) {

        frame = new JFrame();
        frame.setUndecorated(true);

        i1 = new ImageIcon("image/logo.png");
        frame.setIconImage(i1.getImage());

        panel1 = new JPanel();
        panel1.setBounds(650, 0, 800, 768);
        panel1.setBackground(new Color(106, 90, 205));

        panel2 = new JPanel();
        panel2.setBounds(0, 0, 666, 768);
        panel2.setBackground(new Color(240,240,240));

        

        l1 = new JLabel();
        l1.setIcon(new ImageIcon("image/admin.png"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(50, 150, size.width, size.height);

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

        l2 = new JLabel("Admin Dashboard");
        l2.setBounds(700, 50, 500, 40);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 40));

        b4 = new JButton();
        b4.setIcon(new ImageIcon("image/adduser.jpg"));
        b4.setBounds(1020, 160, 300, 220);
        b4.setFocusPainted(false);
        b4.setForeground(Color.white);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        pl1 = new JButton("Add User");
        pl1.setBounds(1020, 385, 300, 35);
        pl1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        pl1.setForeground(Color.white);
        pl1.setFocusPainted(false);
        pl1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pl1.setContentAreaFilled(false);
        pl1.setBorderPainted(false);


        b5 = new JButton();
        b5.setIcon(new ImageIcon("image/addAdmin.jpg"));
        b5.setBounds(1020, 460, 300, 220);
        b5.setFocusPainted(false);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        pl2 = new JButton("Add New Admin");
        pl2.setBounds(1020, 685, 300, 35);
        pl2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        pl2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pl2.setForeground(Color.white);
        pl2.setContentAreaFilled(false);
        pl2.setBorderPainted(false);
        pl2.setFocusPainted(false);

        l3 = new JLabel("User :" + " " + textField1);
        l3.setBounds(1150, 50, 120, 25);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        b6 = new JButton("Sign Out");
        b6.setBounds(1260, 50, 90, 25);
        b6.setFont(new Font("Segoe UI", Font.BOLD, 16));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setFocusPainted(false);
        b6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setContentAreaFilled(false);

        // adding lebel
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);

        // adding button
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);

        frame.add(pl1);
        frame.add(pl2);

        // add
        frame.add(panel1);
        frame.add(panel2);

        frame.setSize(1366, 768);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

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
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });


        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    new AdminDashBoard2(textField1);
                    frame.setVisible(false);
                }
            }
        });
        pl1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == pl1) {
                    new AdminDashBoard2(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    new AdminDashBoard3(textField1);
                    frame.setVisible(false);
                }
            }
        });
        pl2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == pl2) {
                    new AdminDashBoard3(textField1);
                    frame.setVisible(false);
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b6) {
                    new Login("textField1", "textField2");
                    frame.setVisible(false);
                }
            }
        });

    }
}
