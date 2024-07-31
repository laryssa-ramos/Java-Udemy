/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dadospessoas;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/** 
 *
 * @author Laryssa
 */
public class DadosPessoas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serão digitadas: ");
        int quant = sc.nextInt();
        
        sc.nextLine();
        
        double [] alturas = new double [quant];
        String [] genero = new String [quant];
        double menorAltura = Double.MAX_VALUE; // valor máximo que uma variável double pode ter
        double maiorAltura = 0;
        double mediaMulheres = 0;
        double somaMulheres = 0;
        int totalMulheres = 0;
        int totalHomens = 0;
       
        
        
        for(int i = 0; i < quant; i ++){
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            alturas [i] = sc.nextDouble();
            
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            genero[i] = sc.next().toUpperCase(); 
            
            if(alturas [i] < menorAltura){
                menorAltura = alturas[i];
            }
            
            if(alturas [i] > maiorAltura){
                maiorAltura = alturas [i];
            }
            
            if(genero[i].equals("F")){ // a função  "equals" verifica o conteúdo da variável
                somaMulheres += alturas [i];
                totalMulheres ++;
                
            }else {
               totalHomens ++;
                
            }

            
            sc.nextLine();
        }
        
          mediaMulheres = somaMulheres / totalMulheres;
          
        DecimalFormat df = new DecimalFormat("#.##"); // arredonda e formata um número com casa decimal
        
        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.println("Media das alturas das mulheres = " + df.format(mediaMulheres));
        System.out.println("Numero de homens = " + totalHomens);
        
        sc.close();
    }
}
