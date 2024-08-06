/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class Circle extends Shape{
    
    private double C;

    public Circle(double C) {
        this.C = C;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }
    

    @Override
    public double area() {
        return Math.PI * C * C;
    }
    
}
