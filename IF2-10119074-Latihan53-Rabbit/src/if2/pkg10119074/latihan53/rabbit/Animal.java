/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan53.rabbit;

/**
 *
 * @author Acer
 * Nama  : HANDRIAN RIVALDI
 * Kelas : PBOIF2
 * NIM   : 10119074
 * Deskrifsi :
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats(){
        return eats;
    }

    public int getNoOfLegs(){
        return noOfLegs;
    }
    
}
