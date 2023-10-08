/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package task2;

/**
 *
 * @author Muhammad Syaifullah
 */
public class TestShapes {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Circle circle1 = new Circle(5.0);
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle(4.0, 6.0);
        System.out.println(rectangle1);

        Square square1 = new Square(3.0);
        System.out.println(square1);

        square1.setWidth(4.0);
        System.out.println("After changing width: " + square1);
        square1.setLength(5.0);
        System.out.println("After changing length: " + square1);
    }
}
