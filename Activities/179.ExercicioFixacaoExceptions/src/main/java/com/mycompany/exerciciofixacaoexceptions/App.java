/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciofixacaoexceptions;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DomainException;

/**
 *
 * @author Laryssa
 */
public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        try{
                    
        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdraw = sc.nextDouble();
        
        Account account = new Account(number, holder, balance, withdraw);
        
        System.out.println();
        
        System.out.print("Enter amount data: ");
        Double withdrawn = sc.nextDouble();
        
        account.withdraw(withdrawn);
        
        
        System.out.printf("New balance: %.2f", account.getBalance());
        
        }
        
        catch(DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        
        catch(RuntimeException e){
            System.out.println("Unexpected error");
        }
        
        sc.close();
        
    }
}
