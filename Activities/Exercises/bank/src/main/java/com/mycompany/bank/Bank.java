/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank;

import entities.userBank;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class Bank {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bank = new userBank();
        
        System.out.print("Enter account number: ");
        
        
        
    }
}
