/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/**
 * 
 * @author Laryssa
 */
public class UsedProducted extends Product {
    
    private LocalDate manufactureDate;

   
    public UsedProducted(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag(){
        return getName()
                + " $ "
                + String.format("%.2f", getPrice())
                + "(Manufactur date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                +")";
    }
    
    
    
}
