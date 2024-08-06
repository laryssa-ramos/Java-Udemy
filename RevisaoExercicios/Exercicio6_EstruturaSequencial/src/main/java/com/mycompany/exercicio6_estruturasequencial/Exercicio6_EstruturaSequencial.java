/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio6_estruturasequencial;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.Square;
import entities.Trapezoid;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class Exercicio6_EstruturaSequencial {

    public static void main(String[] args) {
       
       /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
       
       Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
       Em seguida, calcule e mostre: 
       
       a) a área do triângulo retângulo que tem A por base e C por altura. 
       b) a área do círculo de raio C. (pi = 3.14159) 
       c) a área do trapézio que tem A e B por bases e C por altura. 
       d) a área do quadrado que tem lado B. 
       e) a área do retângulo que tem lados A e B.
       
       */
       
       
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Valor de A: ");
       double A = sc.nextDouble();
       System.out.print("Valor de B: ");
       double B = sc.nextDouble();
       System.out.print("Valor de C: ");
       double C = sc.nextDouble();
       
       
       Triangle triangle = new Triangle(A, C);
       Circle circle = new Circle(C);
       Trapezoid trapezoid = new Trapezoid(A, B, C);
       Square square = new Square(B);
       Rectangle rectangle = new Rectangle(A, B);
       
       System.out.printf("TRIANGULO: %.2f%n", triangle.area());
       System.out.printf("CIRCLE: %.2f%n",circle.area());
       System.out.printf("TRAPEZOID: %.2f%n", trapezoid.area());
       System.out.printf("SQUARE: %.2f%n",square.area());
       System.out.printf("RECTANGLE: %.2f%n", rectangle.area());
        
      
    }
}
