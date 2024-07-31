/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class Funcionario { 
    
    public String name;
    public double grossSalary;
    public double tax;
    
    public double netSalary(){
    
        return grossSalary - tax;
    
    }
    
    public double IncreaseSalary(double percentagem){
        
       double value;
       return  value = ((percentagem/100) * this.grossSalary) + netSalary();

   }

}
