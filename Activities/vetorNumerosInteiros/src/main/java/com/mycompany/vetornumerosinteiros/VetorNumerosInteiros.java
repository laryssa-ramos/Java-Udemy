/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetornumerosinteiros;

import java.util.Locale;
import java.util.Scanner;

/** 
 *
 * @author Laryssa
 * 
 * Faça um programa que leia N números reais e armazene-os em um vetor. 
 * Em seguida: - Imprimir todos os elementos do vetor - 
 * Mostrar na tela a soma e a média dos elementos do vetor
 * 
 */
public class VetorNumerosInteiros {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        double soma = 0;
        double media = 0;
        
        System.out.print("Quantos números você irá digitar? ");
        num = sc.nextInt();
        
        double [] numeros = new double [num];
        
        for(int i = 0; i < num; i ++){
            System.out.print("Digite o número: ");
            numeros[i] = sc.nextDouble();
        }
        
        System.out.println();
        System.out.println("Números: ");
        
        for(int i = 0; i < num; i ++){
            System.out.printf("%.2f",numeros[i]);
            System.out.println();
        }
        
        for(int i = 0; i < num; i++){
            soma += numeros[i];
        }
        
        media =  soma / num;
        
        System.out.println();
        System.out.printf("Soma: %.2f",soma);
        System.out.println();
        System.out.printf("Soma: %.2f",media);
    }
}
