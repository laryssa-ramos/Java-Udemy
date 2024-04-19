/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetordeprodutos;

import entities.Produtos;
import java.util.Locale;
import java.util.Scanner;
 
/**
 *
 * @author Laryssa 
 */
public class VetorDeProdutos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt(); 
        
         Produtos[] vect = new Produtos[n];
        
         for(int i = 0; i < vect.length; i ++){
             sc.nextLine();
             String name = sc.nextLine();
             double price = sc.nextDouble();
             vect[i] = new Produtos(name, price);
         }
         
         double soma = 0.0;
         for(int i = 0; i < vect.length; i ++){
             soma += vect[i].getPrice();
         }
         
         double media = soma / vect.length;
         
         System.out.printf("Média de preço = %.2f%n", media) ;       
         
         
        sc.close();
}
    }
    
 
