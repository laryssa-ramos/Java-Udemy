/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somavetores;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class SomaVetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Quantos valores vai ter cada vetor? ");
        int quant = sc.nextInt();
        
        int [] vetorA = new int [quant];
        System.out.println("Digite os valores do vetor A: ");
        
        for(int i = 0; i < quant; i ++){
            vetorA[i] = sc.nextInt();
        }
        
        int [] vetorB = new int [quant];
        System.out.println("Digite os valores do vetor B");
        
        for(int i = 0; i < quant; i ++){
            vetorB[i] = sc.nextInt();
        }
        
        int [] vetorC = new int [quant];
         
        for(int i = 0; i < quant; i ++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        
        System.out.println("Vetor resultante: ");
        
        for(int i = 0; i < quant; i++){
            System.out.println(vetorC[i]);
        }
    }
}
