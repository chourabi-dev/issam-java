/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.issam;

 
public abstract class Animal {
    private int nbrPattes;

    public void setNbrPattes(int nbrPattes) {
        this.nbrPattes = nbrPattes;
    }

    public int getNbrPattes() {
        return nbrPattes;
    }
     
    public Animal(int nbrPattes){
        this.nbrPattes = nbrPattes;
    }
    
    
    public abstract void makeSound();
    
     
}
