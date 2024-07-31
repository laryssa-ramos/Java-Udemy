/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciofixacaoclassemetodoabstrado;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List <TaxPayer> list = new ArrayList();
        
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        
         sc.nextLine();
        
        for(int i = 1; i <= n; i ++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company? (i/c)");
            char ch = sc.next().charAt(0);
            
            sc.nextLine();
            
            System.out.print("Name: ");
            String name = sc.nextLine();
      
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
                
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
            
            sc.nextLine();
            
            System.out.println();
        }
        
        double sum = 0.0;
        
        System.out.println();
        System.out.println("TAXES PAID: ");
        
        for (TaxPayer tp : list){
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tax));
            sum += tax;
        }
        
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        sc.close();
    }
    
}
