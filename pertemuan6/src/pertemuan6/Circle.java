/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Muhammad Syaifullah
 */

public class Circle {
    private double radius;
    private String color;

    // Constructors

    // 1st (default) constructor with default values
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor with given radius and default color
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // Constructor with both radius and color parameters
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for radius
    public void setRadius(double r) {
        radius = r;
    }

    // Setter for color
    public void setColor(String c) {
        color = c;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}

