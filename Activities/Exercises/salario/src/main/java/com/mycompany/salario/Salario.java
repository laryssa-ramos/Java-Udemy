/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.salario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Salario {

    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            List<Employees> list = new ArrayList<>();

            System.out.print("How many employees will be registered? ");
            int N = sc.nextInt();

            for (int i=0; i<N; i++) {

                    System.out.println();
                    System.out.println("Emplyoee #" + (i + 1) + ":");
                    System.out.print("Id: ");
                    Integer id = sc.nextInt();

                    System.out.print("Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Salary: ");
                    Double salary = sc.nextDouble();

                    Employees emp = new Employees(id, name, salary);

                    list.add(emp);
 
                    
            }
            
            System.out.println();
              
            System.out.print("Enter employee id that will have salary increase: ");
            int idSalary = sc.nextInt();

            Integer pos = position(list, idSalary);

            if(pos ==  null){
                System.out.println("This id does not exit");
            }else{
                System.out.print("Enter the percentage: ");
                double percent = sc.nextDouble();

                list.get(pos).increaseSalary(percent);
            }

             System.out.println();

             System.out.println("List of employees: ");

             for (Employees emp: list){
                 System.out.println(emp);
             }

        
        sc.close();
    }
    
    public static Integer position(List<Employees> list, int id){
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }     
            return null;
    }
} 
