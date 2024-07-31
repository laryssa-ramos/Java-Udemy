/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class Individual extends TaxPayer{
    
    private double healthExpenditures;

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    

    @Override
    public double tax() {
       double maximumIncome = 20000.00;
       double healthExpend = (50.0 / 100) * getHealthExpenditures();
       double total = 0.0;
       
       if (getAnualIncome() < maximumIncome){
           total =  ((15.0 / 100) * getAnualIncome()) - healthExpend;
           
       } else {
           total =  ((25.0 / 100) * getAnualIncome()) - healthExpend;
           
       }
       
        return total;
    }
    
}
