/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriez;

import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class Matriez {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int [][] mat = new int [n][n];
       
       for(int i = 0; i < mat.length; i++){
           for (int j = 0; j < mat[i].length; j ++){ // "mat[i].length" calula a quantidade de colunas da matriz
               mat[i][j] = sc.nextInt();
           }
       }
       
       System.out.println("Main diagonal");
       for(int i = 0; i < mat.length; i ++){
           System.out.println(mat[i][i] + " "); 
       }
       
       System.out.println();
       
       int count = 0;
       
       for(int i = 0 ; i < mat.length; i ++){
           for (int j = 0; j < n; j ++){
               if(mat [i][j] < 0){
                   count++;
               }
           }
        }
       
       
       System.out.println("Negative numbers: " + count);
       
       sc.close();
    }
}
