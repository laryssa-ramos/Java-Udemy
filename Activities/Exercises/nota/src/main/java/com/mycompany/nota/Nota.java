/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nota;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class Nota {

    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         Student student = new Student();
         
         System.out.print("Informe o nome do aluno: ");
         student.nome = sc.nextLine();
         System.out.println();
         
         System.out.print("Informe a nota do primeiro trimestre: ");
         student.nota1 = sc.nextDouble();
         System.out.println();
         
         System.out.print("Informe a nota do segundo trimestre: ");
         student.nota2 = sc.nextDouble();
         System.out.println();
         
         System.out.print("Informe a nota do terceiro trimestre: ");
         student.nota3 = sc.nextDouble();
         System.out.println();
         
        
         student.avaliacao();
         
         sc.close();
    }
}
