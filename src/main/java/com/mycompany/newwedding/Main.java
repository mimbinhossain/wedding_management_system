package com.mycompany.newwedding;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame {
    
    private Container con;
    private Font h, p, btn, aF;
    private JLabel heading, adminChoice, label, label2, label3, label4, label5;
    private JComboBox optcb;
    private JTextField nameField1, txtField1, txtField2, txtField3, txtField4, txtField5, txtField6, txtField7, txtField8, txtField9;
    private JPasswordField passField;
    private JButton admin, client, exit, login, submit, clearBtn, remove, teamBtn;
    private Cursor cursor;
    
    Main() {
        con = this.getContentPane();
        con.setBackground(Color.DARK_GRAY);
        con.setLayout(null);
        
        ClientFileReadWrite cfrw = new ClientFileReadWrite();
        EmployeeFileReadWrite efrw = new EmployeeFileReadWrite();

        p = new Font("Arial", Font.PLAIN, 14);
        btn = new Font("Arial", Font.BOLD, 16);
        h = new Font("Arial", Font.BOLD, 28);
        
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
        
        admin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                label = new JLabel();
                label.setText("Enter the Username: ");
                label.setBounds(340, 90, 150, 20);
                label.setFont(p);
                label.setForeground(Color.WHITE);
                con.add(label);
                
                nameField1 = new JTextField();
                nameField1.setBounds(490, 90, 150, 20);
                nameField1.setHorizontalAlignment(JTextField.CENTER);
                nameField1.setFont(p);
                con.add(nameField1);
                
                nameField1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (nameField1.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Name can't be blank!", "Warning", 2);
                        }
                    }
                });
                
                label2 = new JLabel();
                label2.setBounds(340, 130, 150, 20);
                label2.setFont(p);
                label2.setForeground(Color.WHITE);
                label2.setText("Enter the Password: ");
                con.add(label2);
                
                passField = new JPasswordField();
                passField.setBounds(490, 130, 150, 20);
                passField.setHorizontalAlignment(JTextField.CENTER);
                passField.setFont(p);
                con.add(passField);
                
                passField.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (passField.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "password can't be blank!", "Warning", 2);
                        }
                    }
                });
                
                login = new JButton();
                login.setText("Login");
                login.setBounds(400, 180, 200, 40);
                login.setFont(btn);
                login.setBackground(Color.BLACK);
                login.setForeground(Color.white);
                con.add(login);
                
                login.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        
                        Admin adm1 = new Admin(nameField1.getText(), passField.getText());
                        
                        if (adm1.temp == false) {
                            JOptionPane.showMessageDialog(null, "Invalid Information!", "Warning", 2);
                        } else {
                            label.setBounds(340, -100, 150, 20);
                            nameField1.setBounds(490, -100, 150, 20);
                            label2.setBounds(340, -100, 150, 20);
                            passField.setBounds(490, -100, 150, 20);
                            login.setBounds(400, -100, 200, 40);

                            aF = new Font("Times New Roman", Font.BOLD, 16);
                            adminChoice = new JLabel();
                            adminChoice.setBounds(320, 90, 200, 20);
                            adminChoice.setFont(aF);
                            adminChoice.setForeground(Color.PINK);
                            adminChoice.setText("Choose Your Choice: ");
                            con.add(adminChoice);
                            
                            String opt[] = {"", "Add Employee", "Remove Employee", "Show Employee", "Exit"};
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
                                            label.setText("Enter the Employee Name: ");
                                            label.setBounds(320, 160, 200, 20);
                                            
                                            txtField1 = new JTextField();
                                            txtField1.setBounds(500, 160, 150, 20);
                                            txtField1.setHorizontalAlignment(JTextField.CENTER);
                                            txtField1.setFont(p);
                                            con.add(txtField1);
                                            
                                            label2.setText("Enter Employee Number: ");
                                            label2.setBounds(320, 200, 200, 20);
                                            
                                            txtField2 = new JTextField();
                                            txtField2.setBounds(500, 200, 150, 20);
                                            txtField2.setHorizontalAlignment(JTextField.CENTER);
                                            txtField2.setFont(p);
                                            con.add(txtField2);
                                            
                                            label3 = new JLabel();
                                            label3.setBounds(320, 240, 200, 20);
                                            label3.setFont(p);
                                            label3.setForeground(Color.WHITE);
                                            label3.setText("Enter Employee Type: ");
                                            con.add(label3);
                                            
                                            txtField3 = new JTextField();
                                            txtField3.setBounds(500, 240, 150, 20);
                                            txtField3.setHorizontalAlignment(JTextField.CENTER);
                                            txtField3.setFont(p);
                                            con.add(txtField3);
                                            
                                            label4 = new JLabel();
                                            label4.setBounds(320, 280, 200, 20);
                                            label4.setFont(p);
                                            label4.setForeground(Color.WHITE);
                                            label4.setText("Enter Employee Id: ");
                                            con.add(label4);
                                            
                                            txtField4 = new JTextField();
                                            txtField4.setBounds(500, 280, 150, 20);
                                            txtField4.setHorizontalAlignment(JTextField.CENTER);
                                            txtField4.setFont(p);
                                            con.add(txtField4);
                                            
                                            label5 = new JLabel();
                                            label5.setBounds(320, 320, 200, 20);
                                            label5.setFont(p);
                                            label5.setForeground(Color.WHITE);
                                            label5.setText("Enter Employee Salary: ");
                                            con.add(label5);
                                            
                                            txtField5 = new JTextField();
                                            txtField5.setBounds(500, 320, 150, 20);
                                            txtField5.setHorizontalAlignment(JTextField.CENTER);
                                            txtField5.setFont(p);
                                            con.add(txtField5);
                                            
                                            submit = new JButton();
                                            submit.setText("Add");
                                            submit.setBounds(400, 380, 200, 40);
                                            submit.setFont(btn);
                                            submit.setBackground(Color.PINK);
                                            submit.setForeground(Color.BLACK);
                                            submit.setCursor(cursor);
                                            con.add(submit);
                                            
                                            submit.addActionListener(new ActionListener() {
                                                public void actionPerformed(ActionEvent e) {
                                                    if (txtField1.getText().isEmpty() || txtField2.getText().isEmpty() || txtField3.getText().isEmpty() || txtField4.getText().isEmpty() || txtField5.getText().isEmpty()) {
                                                        JOptionPane.showMessageDialog(null, "All Input field can't be blank!", "Warning", 2);
                                                    } else {
                                                        Employee emp1 = new Employee(txtField1.getText(), txtField2.getText(), txtField3.getText(), Integer.parseInt(txtField4.getText()), txtField5.getText());
                                                        adm1.addEmployee(emp1);
                                                        
                                                        efrw.writeInFile(emp1.getName());
                                                        efrw.writeInFile(emp1.getPhoneNo());
                                                        efrw.writeInFile(emp1.getEmployeeType());
                                                        efrw.writeInFile(String.valueOf(emp1.getEmployeeId()));
                                                        efrw.writeInFile(emp1.getSalary());
                                                    }
                                                }
                                            });
                                            
                                            break;
                                        
                                        case 2:
                                            label2.setBounds(320, -100, 200, 20);
                                            label3.setBounds(320, -100, 200, 20);
                                            label4.setBounds(320, -100, 200, 20);
                                            label5.setBounds(320, -100, 200, 20);
                                            
                                            txtField1.setBounds(500, -150, 150, 20);
                                            txtField2.setBounds(500, -150, 150, 20);
                                            txtField3.setBounds(500, -150, 150, 20);
                                            txtField4.setBounds(500, -150, 150, 20);
                                            txtField5.setBounds(500, -150, 150, 20);
                                            
                                            submit.setBounds(400, -100, 200, 40);
                                            
                                            label.setText("Enter Employee Id to Remove: ");
                                            label.setBounds(305, 210, 200, 20);
                                            
                                            txtField6 = new JTextField();
                                            txtField6.setBounds(500, 210, 150, 20);
                                            txtField6.setHorizontalAlignment(JTextField.CENTER);
                                            txtField6.setFont(p);
                                            con.add(txtField6);
                                            
                                            remove = new JButton();
                                            remove.setText("Remove");
                                            remove.setBounds(400, 280, 200, 40);
                                            remove.setFont(btn);
                                            remove.setBackground(Color.RED);
                                            remove.setForeground(Color.white);
                                            remove.setCursor(cursor);
                                            con.add(remove);
                                            
                                            remove.addActionListener(new ActionListener() {
                                                public void actionPerformed(ActionEvent e) {
                                                    if (txtField6.getText().isEmpty()) {
                                                        JOptionPane.showMessageDialog(null, "Enter the Employee Id!", "Warning", 2);
                                                    } else {
                                                        adm1.removeEmployee(Integer.parseInt(txtField6.getText()));
                                                    }
                                                }
                                            });
                                            
                                            break;
                                        
                                        case 3:
                                            label.setBounds(305, -210, 200, 20);
                                            txtField6.setBounds(500, -210, 150, 20);
                                            remove.setBounds(400, -280, 200, 40);
                                            
                                            adm1.showEmployees(con);
                                            break;
                                        case 5:
                                            con.remove(optcb);
                                            int num = JOptionPane.showConfirmDialog(null, "Are you want to exit?");
                                            if (num == 0) {
                                                System.exit(0);
                                            }
                                    }
                                    
                                    clearBtn = new JButton();
                                    clearBtn.setText("Clear");
                                    clearBtn.setBounds(760, 300, 100, 30);
                                    clearBtn.setFont(btn);
                                    clearBtn.setBackground(Color.BLACK);
                                    clearBtn.setForeground(Color.white);
                                    clearBtn.setCursor(cursor);
                                    con.add(clearBtn);
                                    
                                    clearBtn.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            txtField1.setText("");
                                            txtField2.setText("");
                                            txtField3.setText("");
                                            txtField4.setText("");
                                            txtField5.setText("");
                                            txtField6.setText("");
                                            txtField7.setText("");
                                            txtField8.setText("");
                                            txtField9.setText("");
                                        }
                                    });
                                    
                                }
                            });
                        }
                    }
                });
                
            }
        });
        
        client = new JButton();
        client.setText("Client");
        client.setBounds(50, 140, 100, 30);
        client.setFont(btn);
        client.setBackground(Color.BLACK);
        client.setForeground(Color.white);
        client.setCursor(cursor);
        con.add(client);
        
        client.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Client cl = new Client();
            }
        });

    }
    
    public static void main(String[] args) {
        Main frame = new Main();
        Main frame2 = new Main();
        frame.setTitle("Wedding Management System");
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
