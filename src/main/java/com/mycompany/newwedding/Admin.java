package com.mycompany.newwedding;

import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Admin {

    public String userName = "mim";
    public String password = "1234";
    public boolean temp = false;
    public static Employee employees[] = new Employee[30];

    public Admin() {

    }

    public Admin(String name, String pass) {
        if (!(this.userName.equals(name)) || !(this.password.equals(pass))) {
            temp = false;
        } else {
            temp = true;
        }

    }

    public void addEmployee(Employee emp) {
        int flag = 0;
        try {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = emp;
                    flag = 1;
                    break;
                }

            }

            if (flag == 1) {
                JOptionPane.showMessageDialog(null, "Employee Added", "Information", 1);
            } else {
                JOptionPane.showMessageDialog(null, "OOPS!! Couldn't Add Employee", "Information", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exception Occurred", "Information", 2);
        }
    }

    public void removeEmployee(int id) {
        int flag = 0;
        try {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].empId == id) {
                    employees[i] = null;
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                JOptionPane.showMessageDialog(null, "Employee Removed", "Information", 1);
            } else {
                JOptionPane.showMessageDialog(null, "OOPS!! Couldn't Remove Employee", "Information", 2);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Employee having this ID", "Information", 2);
        }
    }

    JTable j;
    Container c;

    public void showEmployees(Container con) {

        this.c = con;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {

                String[][] data = {
                    {employees[i].empName, employees[i].phoneNo, employees[i].empType, Integer.toString(employees[i].empId), employees[i].salary}
                };

                String columnNames[] = {"Employee Name", "Phone Number", "Employee Type", "Employee Id", "Salary"};

                j = new JTable(data, columnNames);
                JScrollPane sp = new JScrollPane(j);

                sp.setBounds(200, 160, 520, 300);
                c.add(sp);

            }
        }

    }
}
