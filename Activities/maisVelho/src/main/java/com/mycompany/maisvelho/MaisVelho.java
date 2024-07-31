/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maisvelho;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class MaisVelho {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas você vai digitar? ");
        int quant = sc.nextInt();
        
        sc.nextLine();
        
        String [] nomes = new String [quant];
        int [] idade = new int [quant];
        int maiorIdade = 0;
        String maisVelha = null;
        
        for(int i = 0; i < quant; i ++){
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes [i] = sc.nextLine();
            System.out.print("Idade: ");
            idade [i] = sc.nextInt();
            
            if(idade [i] > maiorIdade){
                maiorIdade = idade [i];
                maisVelha = nomes [i];
            }
            
            sc.nextLine();
        }
        
        System.out.println("PESSOA MAIS VELHA: " + maisVelha);
        
        
        sc.close();
    }
}
