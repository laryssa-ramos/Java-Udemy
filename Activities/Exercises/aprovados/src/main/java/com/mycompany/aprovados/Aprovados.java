/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aprovados;

import java.util.Locale;
import java.util.Scanner;

/** 
 *
 * @author Laryssa
 */
public class Aprovados {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner (System.in);
       
       System.out.println("Quantos alunos serão digitados? ");
       int quant = sc.nextInt();
       
       sc.nextLine();
       
       String [] nomes = new String [quant];
       double [] nota1 = new double [quant];
       double [] nota2 = new double [quant];
       double media = 0;
       
       
       for(int i = 0; i < quant; i ++){
           System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
           nomes [i] = sc.nextLine();
           nota1 [i] = sc.nextDouble();
           nota2 [i] = sc.nextDouble();
           
           sc.nextLine();
       }
       
      
       
       System.out.println("Alunos aprovados: ");
       
       for(int i = 0; i < quant; i ++){
           media = (nota1[i] + nota2[i]) / 2;
           
           if(media >= 6){
               System.out.println(nomes[i]);
           }
       }
       
    }
}
