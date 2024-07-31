/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciofixacaopolimorfismo;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProducted;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
       Scanner sc = new Scanner (System.in);
       
       List<Product> list = new ArrayList<>();
       
       System.out.print("Enter the number of products: ");
       int n = sc.nextInt();
       
       System.out.println();
       
        for(int i = 1; i <= n ; i ++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Commun, used or imported? :");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            
            if(ch == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if(ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProducted(name, price, date));
            } else{
                list.add(new Product(name, price));
            }
            
            System.out.println();
        }
        
        System.out.println();
        System.out.println("PRICE TAGS: ");
        
        for (Product pro : list){
            System.out.println(pro.priceTag());
        }
       
       sc.close();
    }
}
