/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package kasus2;

/**
 *
 * @author Muhammad Syaifullah
 */
public class Sphere extends Shape{
    private double radius;

    public Sphere(double r) {
            super("Sphere");
            this.radius = r;
    }

    @Override
    public double area() {
            return 4*Math.PI*radius*radius;
    }
    public String toString() {
            return super.toString() + " of radius " + radius;
    }
	
}
