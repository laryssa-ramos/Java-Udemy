/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank1;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class Bank1 {

    public static void main(String[] args) {
        
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       Account account;
       
       System.out.print("Enter account number: ");
       int nuber = sc.nextInt();
       
       System.out.print("Enter account holder: ");
       sc.nextLine();
       String holder = sc.nextLine();
       
       System.out.print("Is there an initial deposit (y/n)? ");
       char response = sc.next().charAt(0); //lê o próximo conjunto de caracteres inseridos pelo usuário e armazena o primeiro caractere dessa entrada na variável response.
       
            if(response ==  'y'){
                System.out.print("Enter initial deposit value: ");
                double initialDesposit = sc.nextDouble();
                account = new Account(nuber, holder, initialDesposit);
            } else{
                account = new Account(nuber, holder);
            }
       
       System.out.println();
       System.out.println("Account date");
       System.out.println(account);
       
       System.out.println();
       System.out.print("Enter a deposit value: ");
       double depositValue = sc.nextDouble();
       account.deposit(depositValue);
       System.out.println("Updated account data:");
       System.out.println(account);
       
       System.out.println();
       System.out.print("Enter a withdraw value: ");
       double withdrawValue = sc.nextDouble();
       account.withdraw(withdrawValue);
       System.out.println("Updated account data:");
       System.out.println(account);
       
       
       sc.close();
       
       
    }
}
