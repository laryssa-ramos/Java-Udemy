/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alturas;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

/** 
 *
 * @author Laryssa
 *  
 * Fazer um programa para ler nome, idade e altura de N pessoas, 
 * conforme exemplo. Depois, mostrar na tela a altura média das pessoas,
 * e mostrar também a porcentagem de pessoas com menos de 16 anos,
 * bem como os nomes dessas pessoas caso houver.
 * 
 */
public class Alturas {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
     
       System.out.print("Quantas pessoas serão digitadas? ");
       int num = sc.nextInt();
       
        Pessoa[] pessoa = new Pessoa[num];
        
         sc.nextLine();
       
       for(int i = 0; i < num; i++){
           System.out.println("Dados da pessoa " + (i + 1) + "a pessoa: ");
           System.out.print("Nome: ");
           String nome = sc.nextLine();
           System.out.print("Idade: ");
           int idade = sc.nextInt();
           System.out.print("Altura: ");
           double altura = sc.nextDouble();
           
           sc.nextLine();
           
           pessoa[i] = new Pessoa(nome, idade, altura);
           
       }
       
       
       /*Media altura*/
       
       double soma = 0.0;
               
       for(int i = 0; i < num; i ++){
           soma += pessoa[i].getAltura();
       }
       
       double media = soma / num;
       
        /*Porcentagem de pessoas com menos de 16 anos*/
        
       int cont = 0;
        
       for(int i = 0; i < num; i ++){
           if(pessoa[i].getIdade() < 16){
               cont += 1;
           }
       }
       
      double porcentagem = ((double)cont / num) * 100;
      
      System.out.println("");
      System.out.printf("\nAltura média: %.2f\n",media);
      System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
       
      for(int i = 0; i < num; i ++){
          if(pessoa[i].getIdade() < 16){
              System.out.println(pessoa[i].getNome());
          }
      }
       
       sc.close();
    }
}
