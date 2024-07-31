/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetornumerosnegativos;

import java.util.Locale;
import java.util.Scanner;
 
/**
 *
 * @author Laryssa
 * 
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) 
 * e depois N números inteiros e armazene-os em um vetor. 
 * Em seguida, mostrar na tela todos os números negativos lidos.
 */
public class VetorNumerosNegativos {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Quantos números você vai digitar?");
       int num = sc.nextInt();
       
       if(num > 10){
           System.out.println("São permitidos no máximo 10 números");
           
       } else{
           int [] vect = new int[num];
         
           
           for(int i = 0; i < num; i ++){
               System.out.print("Informe um número: ");
               vect[i] = sc.nextInt();
               
           }
           
           System.out.println("Números negativos: ");
            
           for(int i = 0; i < num; i ++){
               if(vect[i] < 0){
                   System.out.printf("%d\n", vect[i]);
               }
           }
           
        
       }
       
       
       sc.close();
    }
}
