/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.issam;


public class Hero {
    
    private int puissance;
    private String name;
    
    
    public Hero() {
    }

    public Hero(int puissance, String name) {
        this.puissance = puissance;
        this.name = name;
    }
    
    
    
    

    public int getPuissance() {
        return puissance;
    }

    public String getName() {
        return name;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public void jump(){
        System.out.println("hero is jumping...");
    }
    
    
    public void strike(){
          System.out.println("hero is stiking...");
    }
    
     
    
    
}
