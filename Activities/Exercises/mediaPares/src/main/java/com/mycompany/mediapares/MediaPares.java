/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediapares;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class MediaPares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int quant = sc.nextInt();
        
        int [] numeros = new int [quant];
        int numerosPares = 0;
        int media = 0;
        int cont = 0;
        
        for(int i = 0; i < quant; i ++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            
            if(numeros[i] % 2 == 0){
                numerosPares += numeros[i];
                cont += 1;
            }
        }
        
        if(cont != 0){
             media = numerosPares / cont;
             System.out.print("MEDIA DOS PARES = " + media);
             
        } else {
             System.out.print("NENHUM NÚMERO PAR");
            
        }
         
        sc.close();
        
    }
}
