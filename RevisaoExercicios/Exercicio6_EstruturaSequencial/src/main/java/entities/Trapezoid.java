/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class Trapezoid extends Shape{
    
    private double A;
    private double B;
    private double C;

    public Trapezoid(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }
    
    

    @Override
    public double area() {
        return (A + B) / 2.0 * C;
    }
    
}
