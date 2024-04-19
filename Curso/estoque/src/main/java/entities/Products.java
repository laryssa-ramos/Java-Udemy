/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class Products {
    
    private String name;
    private double price;
    private int quantity; 

    public Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
        public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    } 
  

    
    public double totalValueInStock(){
        return price * quantity;
    }
    
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    
    public void removeProducts(int quantity){
        this.quantity-= quantity;
    }
    
    public String toString(){
        return name
                +", $"
                + String.format("%.2f", price)
                +", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
    
}
