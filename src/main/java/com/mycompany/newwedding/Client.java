package com.mycompany.newwedding;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class EventType {

    String et;

    EventType(String et) {
        this.et = et;
    }

    void eventVenue(String v, int h) {

    }

    void venueCharge() {

    }
}

class Engagement extends EventType {

    String v;
    int h, charge = 0;
    Container con;

    Engagement(String type) {
        super(type);
    }

    void eventVenue(String v, int h, Container c) {
        this.v = v;
        this.h = h;
        this.con = c;
    }

    void venueCharge() {
        if (this.v.equalsIgnoreCase("A")) {
            this.charge = this.h * 1000;
        } else if (this.v.equalsIgnoreCase("B")) {
            this.charge = this.h * 2500;
        }
    }

    void display(boolean bool) {

        JLabel eventHeading, eventLabel, eventLabe2, eventLabe3, hr, cost;

        Font evF = new Font("Arial", Font.BOLD, 16);

        eventHeading = new JLabel();
        eventHeading.setForeground(Color.PINK);
        eventHeading.setText("Your Event Details");
        eventHeading.setFont(evF);

        eventLabel = new JLabel();
        eventLabel.setForeground(Color.WHITE);

        eventLabe2 = new JLabel();
        eventLabe2.setForeground(Color.WHITE);

        eventLabe3 = new JLabel();
        eventLabe3.setForeground(Color.WHITE);

        cost = new JLabel();
        cost.setForeground(Color.WHITE);

        if (bool == true) {
            eventHeading.setBounds(750, 150, 200, 20);
            con.add(eventHeading);

            eventLabel.setText("Event Type: " + super.et);
            eventLabel.setBounds(750, 200, 300, 20);
            con.add(eventLabel);

            eventLabe2.setText("Event Venue: " + this.v);
            eventLabe2.setBounds(750, 230, 300, 20);
            con.add(eventLabe2);

            eventLabe3.setText("Event Hours: " + this.h);
            eventLabe3.setBounds(750, 260, 300, 20);
            con.add(eventLabe3);

            hr = new JLabel();
            hr.setText("---------------------------------------------------------------");
            hr.setBounds(750, 280, 200, 20);
            hr.setForeground(Color.WHITE);
            con.add(hr);

            cost.setText("Total Cost: " + this.charge);
            cost.setBounds(750, 300, 200, 20);
            con.add(cost);
        } else {
            eventHeading.setBounds(750, -150, 200, 20);
            eventLabel.setBounds(750, -200, 300, 20);
            eventLabe2.setBounds(750, -230, 300, 20);
            eventLabe3.setBounds(750, -260, 300, 20);
            cost.setBounds(750, 300, -200, 20);
        }
    }
}

class Prewedding extends EventType {

    String v;
    int h, charge = 0;
    Container con;

    Prewedding(String type) {
        super(type);
    }

    void eventVenue(String v, int h, Container c) {
        this.v = v;
        this.h = h;
        this.con = c;
    }

    void venueCharge() {
        if (this.v.equalsIgnoreCase("C")) {
            this.charge = this.h * 1500;
        } else if (this.v.equalsIgnoreCase("D")) {
            this.charge = this.h * 2000;
        }
    }
    
    void display() {
        Font evF = new Font("Arial", Font.BOLD, 16);

        JLabel eventHeading = new JLabel();
        eventHeading.setBounds(750, 150, 200, 20);
        eventHeading.setForeground(Color.PINK);
        eventHeading.setText("Your Event Details");
        eventHeading.setFont(evF);
        con.add(eventHeading);

        JLabel eventLbl = new JLabel();
        eventLbl.setText("Event Type: " + super.et);
        eventLbl.setBounds(750, 200, 300, 20);
        eventLbl.setForeground(Color.WHITE);
        con.add(eventLbl);

        JLabel eventLbl2 = new JLabel();
        eventLbl2.setText("Event Venue: " + this.v);
        eventLbl2.setBounds(750, 230, 300, 20);
        eventLbl2.setForeground(Color.WHITE);
        con.add(eventLbl2);

        JLabel eventLbl3 = new JLabel();
        eventLbl3.setText("Event Hours: " + this.h);
        eventLbl3.setBounds(750, 260, 300, 20);
        eventLbl3.setForeground(Color.WHITE);
        con.add(eventLbl3);

        JLabel hr = new JLabel();
        hr.setText("---------------------------------------------------------------");
        hr.setBounds(750, 280, 200, 20);
        hr.setForeground(Color.WHITE);
        con.add(hr);

        JLabel cost2 = new JLabel();
        cost2.setText("Total Cost: " + this.charge);
        cost2.setBounds(750, 300, 200, 20);
        cost2.setForeground(Color.WHITE);
        con.add(cost2);

    }
}

public class Client extends JFrame {

    private Container con;
    private JLabel heading, cleintChoice, label, label2;
    private JTextField inputField, inputField2, value1, value2, txt1, txt2;
    private Font h, p, btn, clF;
    private Cursor cursor;
    private JButton admin, client, submit, submit2;
    private JComboBox optcb;
    private JTable table, table2;
    private JScrollPane jscroll;
    Engagement ob;

    public void tempData(Object obj) {
        this.ob = (Engagement) obj;
    }

    Client() {
        setTitle("Wedding Management System");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        con = this.getContentPane();
        con.setBackground(Color.DARK_GRAY);
        con.setLayout(null);

        h = new Font("Arial", Font.BOLD, 28);
        p = new Font("Arial", Font.PLAIN, 14);
        btn = new Font("Arial", Font.BOLD, 16);
        clF = new Font("Times New Roman", Font.BOLD, 16);

        heading = new JLabel();
        heading.setBounds(280, 0, 600, 80);
        heading.setForeground(Color.WHITE);
        heading.setText("Wedding Management System");
        heading.setFont(h);
        con.add(heading);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        admin = new JButton();
        admin.setText("Admin");
        admin.setBounds(50, 90, 100, 30);
        admin.setFont(btn);
        admin.setBackground(Color.BLACK);
        admin.setForeground(Color.white);
        admin.setCursor(cursor);
        con.add(admin);

        client = new JButton();
        client.setText("Client");
        client.setBounds(50, 140, 100, 30);
        client.setFont(btn);
        client.setBackground(Color.BLACK);
        client.setForeground(Color.white);
        client.setCursor(cursor);
        con.add(client);

        cleintChoice = new JLabel();
        cleintChoice.setBounds(320, 90, 200, 20);
        cleintChoice.setFont(clF);
        cleintChoice.setForeground(Color.PINK);
        cleintChoice.setText("Choose Your Choice: ");
        con.add(cleintChoice);

        String opt[] = {"", "Engagement Planning", "Pre-wedding Planning", "Exit"};
        optcb = new JComboBox(opt);
        optcb.setBounds(500, 90, 150, 20);
        con.add(optcb);

        optcb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index2 = optcb.getSelectedIndex();

                switch (index2) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Choose your option!", "Information", 1);
                        break;
                    case 1:
                        Engagement eng = new Engagement("Engagement");
                        String chart[][] = {
                            {"A", "1000"}, {"B", "2500"}
                        };

                        String colName[] = {"Venue Name", "Charges Per Hour"};

                        table = new JTable(chart, colName);
                        jscroll = new JScrollPane(table);
                        jscroll.setBounds(335, 150, 300, 60);

                        con.add(jscroll);
                        
                        label = new JLabel();
                        label.setText("Enter Venue Name: ");
                        label.setFont(p);
                        label.setBounds(340, 250, 150, 20);
                        label.setForeground(Color.WHITE);
                        con.add(label);

                        value1 = new JTextField();
                        value1.setBounds(480, 250, 150, 20);
                        value1.setHorizontalAlignment(JTextField.CENTER);
                        value1.setFont(p);
                        con.add(value1);

                        label2 = new JLabel();
                        label2.setText("Number Hours: ");
                        label2.setFont(p);
                        label2.setBounds(340, 290, 150, 20);
                        label2.setForeground(Color.WHITE);
                        con.add(label2);

                        value2 = new JTextField();
                        value2.setBounds(480, 290, 150, 20);
                        value2.setHorizontalAlignment(JTextField.CENTER);
                        value2.setFont(p);
                        con.add(value2);

                        submit = new JButton();
                        submit.setText("Submit");
                        submit.setBounds(400, 340, 150, 30);
                        submit.setFont(btn);
                        submit.setBackground(Color.pink);
                        submit.setForeground(Color.BLACK);
                        submit.setCursor(cursor);
                        con.add(submit);

                        submit.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                if (value1.getText().isEmpty() || value2.getText().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Any field can't be blank!", "Warning", 2);
                                } else {
                                    eng.eventVenue(value1.getText(), Integer.parseInt(value2.getText()), con);
                                    eng.venueCharge();
                                    eng.display(true);

                                    value1.setText("");
                                    value2.setText("");

                                    JOptionPane.showMessageDialog(null, "Please hide the frame and open again!", "Success", 1);

                                    tempData(eng);

                                }
                            }
                        });

                        break;

                    case 2:

                        ob.display(false);

                        value1.setBounds(335, -150, 300, 60);
                        value2.setBounds(335, -150, 300, 60);
                        jscroll.setBounds(335, -150, 300, 60);
                        submit.setBounds(400, -340, 150, 30);

                        
                        Prewedding pre = new Prewedding("Pre-wedding");

                        String data[][] = {
                            {"C", "1500"}, {"D", "2000"}
                        };

                        String col[] = {"Venue Name", "Charges Per Hour"};

                        JTable table2 = new JTable(data, col);
                        JScrollPane jscroll2 = new JScrollPane(table2);
                        jscroll2.setBounds(335, 150, 300, 60);

                        con.add(jscroll2);

                        txt1 = new JTextField();
                        txt1.setBounds(480, 250, 150, 20);
                        txt1.setHorizontalAlignment(JTextField.CENTER);
                        txt1.setFont(p);
                        con.add(txt1);

                        txt2 = new JTextField();
                        txt2.setBounds(480, 290, 150, 20);
                        txt2.setHorizontalAlignment(JTextField.CENTER);
                        txt2.setFont(p);
                        con.add(txt2);

                        submit2 = new JButton();
                        submit2.setText("Submit");
                        submit2.setBounds(400, 340, 150, 30);
                        submit2.setFont(btn);
                        submit2.setBackground(Color.pink);
                        submit2.setForeground(Color.BLACK);
                        submit2.setCursor(cursor);
                        con.add(submit2);

                        submit2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                if (txt1.getText().isEmpty() || txt2.getText().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Any field can't be blank!", "Warning", 2);
                                } else {
                                    pre.eventVenue(txt1.getText(), Integer.parseInt(txt2.getText()), con);
                                    pre.venueCharge();
                                    pre.display();

                                    JOptionPane.showMessageDialog(null, "Please hide the frame and open again!", "Success", 1);

                                }
                            }
                        });

                        break;

                    case 3:
                        int num = JOptionPane.showConfirmDialog(null, "Are you want to exit?");
                        if (num == 0) {
                            System.exit(0);
                        }
                }
            }
        }
        );

    }

}
