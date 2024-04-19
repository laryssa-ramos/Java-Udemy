/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.user;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class User {

    public static void main(String[] args) {
        
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       Pessoa pessoa;
       
       System.out.print("Nome: ");
       String nome = sc.nextLine();
       
       System.out.print("Ano de nascimento: ");
       int anoNascimento = sc.nextInt();
       
       System.out.print("Ano atual: ");
       int anoAtual = sc.nextInt();
     
       
       System.out.print("Altura: ");
       double altura = sc.nextDouble();
       
       pessoa = new Pessoa(nome, anoNascimento, altura);
       
       System.out.println(pessoa);
       System.out.print("Idade: " + pessoa.idade(anoAtual) + "anos");
       
       
       sc.close();
    }
}
