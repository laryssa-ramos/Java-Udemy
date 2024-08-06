/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class Square extends Shape{
    
    private double B;

    public Square(double B) {
        this.B = B;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }
    

    @Override
    public double area() {
        return B * B;
    }
    
}
