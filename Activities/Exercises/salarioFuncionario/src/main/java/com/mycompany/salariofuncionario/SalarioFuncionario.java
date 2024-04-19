/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariofuncionario;

import entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa 
 */
public class SalarioFuncionario {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Funcionario funcionario = new Funcionario();
        
        System.out.print("Informe o nome do funcionário: ");
        funcionario.name = sc.nextLine();
        
        System.out.print("Informe o salário bruto: ");
        funcionario.grossSalary= sc.nextDouble();
        
        System.out.print("Informe a taxa: ");
        funcionario.tax = sc.nextDouble();
        
        System.out.println();
        
        System.out.println("Funcionário: " + funcionario.name + ", $" + funcionario.netSalary());
        System.out.println();
        
        System.out.print("Qual porcentagem quer acrescentar ao salário?: ");
        double percentagem = sc.nextDouble();
        funcionario.IncreaseSalary(percentagem);
        System.out.println();
        
        System.out.println("Informações: " + funcionario.name + ", $" + funcionario.IncreaseSalary(percentagem));
        
        sc.close();
    }
}
