/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.issam.models;
 
public class Employee {
    private float salary;
    private String department;

    public float getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(float salary, String department) {
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return (this.department+" "+this.salary);
    }
    
    
    
    
    
}
