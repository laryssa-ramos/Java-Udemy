/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class Triangle extends Shape {
    
    private double A;
    private double C;

    public Triangle(double A, double C) {
        this.A = A;
        this.C = C;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }
    
    

    @Override
    public double area() {
       return A * C / 2.0;
    }
    
    
    
}
