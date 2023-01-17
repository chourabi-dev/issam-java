/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.issam;

 
public class Cat extends Animal implements AnimalGames {
    
    public Cat(int nbrPattes){
        super(nbrPattes);
    }

    @Override
    public void makeSound() {
          System.out.println("miouw");
    }

    @Override
    public void play() {
         System.out.println("cat is playing with the ball");
    }
    
    
    
}
