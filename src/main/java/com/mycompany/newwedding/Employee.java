package com.mycompany.newwedding;

import javax.swing.JOptionPane;

public class Employee {

    String empName;
    String phoneNo;
    String empType;
    int empId;
    String salary;

    public Employee() {
        JOptionPane.showMessageDialog(null, "No Employees available", "Information", 2);
    }

    public Employee(String name, String phone, String type, int id, String salary) {
        this.empName = name;
        this.phoneNo = phone;
        this.empType = type;
        this.empId = id;
        this.salary = salary;
    }

    public void setName(String empName) {
        this.empName = empName;
    }

    public String getName() {
        return empName;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setEmployeeType(String employeeType) {
        this.empType = employeeType;
    }

    public String getEmployeeType() {
        return empType;
    }

    public void setEmployeeId(int employeeId) {
        this.empId = employeeId;
    }

    public int getEmployeeId() {
        return empId;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

}
