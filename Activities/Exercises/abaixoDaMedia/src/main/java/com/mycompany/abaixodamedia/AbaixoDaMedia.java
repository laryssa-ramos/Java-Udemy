/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abaixodamedia;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Laryssa
 */
public class AbaixoDaMedia {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Quantos elementos vai ter o vetor: ");
       int quant = sc.nextInt();
       
       double [] numeros = new double [quant];
       double media = 0;
       
       for(int i = 0; i < quant; i ++){
           System.out.print("Digite um número: ");
           numeros [i] = sc.nextDouble();
       }
       
       for(int i = 0; i < quant; i ++){
           media += numeros[i] / quant;
       }
       
       System.out.println();
       
       System.out.printf("MEDIA DO VETOR: %.3f%n", + media);
       
       System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
       for(int i = 0; i < quant; i ++){
           if(numeros[i] < media){
               System.out.printf("%.1f%n", + numeros [i]);
           }
       }
       
       sc.close();
    }
}
