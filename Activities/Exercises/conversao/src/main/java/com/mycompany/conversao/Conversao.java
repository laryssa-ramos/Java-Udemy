/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversao;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

/**
 *
 * @author Laryssa
 */
public class Conversao {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Whats is the dollar price? ");
       double dollar = sc.nextDouble();
        
       System.out.print("How many dollars will be bought? ");
       double reais = sc.nextDouble();
       
       double total = CurrencyConverter.calculo(dollar, reais);
       
       System.out.printf("Amount to be paid in  reais = %.2f%n", total );
    }
}
