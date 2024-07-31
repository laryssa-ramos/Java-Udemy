/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Laryssa
 */
public class CurrencyConverter {
    
    public static double IOF = 0.06;
     
    public static double calculo ( double dollar, double reais){
        
        return dollar * reais * (1.0 + IOF);
    
     
    
    }

}
