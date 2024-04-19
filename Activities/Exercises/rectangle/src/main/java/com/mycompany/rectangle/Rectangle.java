/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

import entities.RectangleInfo;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Laryssa
 */
public class Rectangle {

    public static void main(String[] args) {
        
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner (System.in);
      
      RectangleInfo rectangle = new RectangleInfo();
      
      System.out.print("Informe a altura do retângulo: ");
      rectangle.height = sc.nextDouble();
      
      System.out.print("Infome a largura do retângulo: ");
      rectangle.width = sc.nextDouble();
      
      System.out.println();
      
      System.out.println("Área: " + rectangle.area());
      System.out.println("Perímetro: " + rectangle.perimeter());
      System.out.println("Diagonal: " + rectangle.diagonal());
      
      sc.close();
    }
}
