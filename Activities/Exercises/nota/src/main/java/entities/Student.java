/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class Student {
     public String nome;
     public double nota1;
     public double nota2;
     public double nota3;
     
     public double somaNota(){
         
         double soma = 0;
     
         if(nota1 <= 30 && nota2 <= 35 && nota3 <= 35 ){
             soma =  nota1 + nota2 + nota3;
             
         }else{
             System.out.println("Valores inválidos: ");
             
         }
         
         return soma;
         
     } 
     
     public void avaliacao(){
     
         if (somaNota() >= 60){
             System.out.println("FINAL GRADE: " + somaNota());
             System.out.println("PASSOU");
             
         } else{
             System.out.println("FINAL GRADE: " + somaNota());
             System.out.println("REPROVOU ");
         
         }
     
     }
            
     
}
