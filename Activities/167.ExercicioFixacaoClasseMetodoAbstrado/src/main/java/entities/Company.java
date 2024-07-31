/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class Company  extends TaxPayer{
    
    private int numberOfEmployees;

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    

    @Override
    public double tax() {
        double total = 0.0;
        
        if(getNumberOfEmployees() <= 10){
            total = 0.16 * getAnualIncome();
            
        }else {
            total = 0.14 * getAnualIncome();
        }
        
        return total;
    }
    
}
