/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package kasus2;

/**
 *
 * @author Muhammad Syaifullah
 */
public class Paint {
    private double coverage ;
    public Paint(double c) {
            this.coverage = c;
    }

    public double amount(Shape s) {
            System.out.println("Computing amount for " + s);
            return s.area();
    }
}
