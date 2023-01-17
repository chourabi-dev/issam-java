/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.issam.controllers;

import com.mycompany.issam.models.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeController {
    List<Employee> employees;
    
    public EmployeeController(){
        // init a new employees list;
        this.employees = new ArrayList<Employee>(); 
    }
    
    
    public void addEmployee(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Employee department: "); 
        String dep = sc.nextLine();
        
        System.out.println("Employee salary: "); 
        float salary = sc.nextFloat();
         
        
        Employee e = new Employee(salary,dep);
        // FUTURE forms web Angular !!
        
        this.employees.add(e);
        
    }
    
    
    public void getEmployeesList(){
        for( Employee e : employees ){
            System.out.println(e);
        }
    }
    
}
