/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class OrderItem {
    
    private Integer quantity;
    private Double price;
    
    private Product product;
    
    public OrderItem(){}

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    

    

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public Product getProduct() {
            return product;
    }

    public void setProduct(Product product) {
            this.product = product;
    }
    
    public Double subTotal(){
        
        return getQuantity() * getPrice();
    }
    
    
    	@Override
	public String toString() {
            return product.getName() 
                + ", $" 
                + String.format("%.2f", price) 
                + ", Quantity: " 
                + quantity + 
                ", Subtotal: $" 
                + String.format("%.2f", subTotal());
	}
    
}
