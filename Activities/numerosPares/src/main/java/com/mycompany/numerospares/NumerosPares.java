/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerospares;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 * 
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. 
 * Em seguida, mostre na tela todos os números pares, 
 * e também a quantidade de números pares.
 */
public class NumerosPares {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números você vai digitar?");
        int num = sc.nextInt();
        
        int [] numeros = new int [num];
        
        
        for(int i = 0; i < num; i++){
            System.out.print("Digite o número:");
            numeros[i] = sc.nextInt();
           
        }
        
        sc.nextLine(); 
        
        System.out.println("NÚMEROS PARES: ");
        
        int cont = 0;
        
        for(int i =0; i < num; i++){
            
            if(numeros[i] % 2 == 0 ){
                System.out.print("  " + numeros[i]); 
                cont += 1;
            }
            
        }
        System.out.print("\nQUANTIDADE DE NÚEMROS PARES: " + cont);
    }
}
