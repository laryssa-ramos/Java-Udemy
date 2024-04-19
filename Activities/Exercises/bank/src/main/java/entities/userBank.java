/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class userBank {
        
    private String name;
    private int numberAccout;
    private double balance;

    public userBank(String name, int numberAccout, double balance) {
        this.name = name;
        this.numberAccout = numberAccout;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberAccout() {
        return numberAccout;
    }

    public void setNumberAccout(int numberAccout) {
        this.numberAccout = numberAccout;
    }

    public double getBalance() {
        return balance;
    }
   
    
}
