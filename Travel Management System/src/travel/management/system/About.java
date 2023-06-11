package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {
        setLayout(null);
        
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 460, 120, 20);
        b1.addActionListener(this);

        JLabel l1 = new JLabel("Designed By:-Kiran Pandit");
        add(l1);
        l1.setBounds(320, 480, 300, 20);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s =  "The objective of the Travel and Tourism Management System"
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification";

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 40, 450, 400);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l2 = new JLabel("About Project");
        add(l2);
        l2.setBounds(170, 0, 180, 40);
        l2.setForeground(Color.red);

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l2.setFont(f2);

        setBounds(700, 220, 500, 550);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }
}
