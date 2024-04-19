/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiorposicao;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class MaiorPosicao {

    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Quantos números você vai digitar? ");
      int quant = sc.nextInt();
      
      int [] numeros = new int [quant];
      int num = 0;
      int maior = 0;
      int posicao = 0;
      
      
      for(int i = 0; i < quant; i ++){
          System.out.print("Digite um número: ");
          num = sc.nextInt();
                  
          if(num > maior){
              maior = num;
              posicao = i;
            }
        }
     
      
      System.out.println();
      System.out.printf("MAIOR VALOR = %d", + maior);
      System.out.println();
      System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", + posicao);
      
     sc.close();
     
    }
}