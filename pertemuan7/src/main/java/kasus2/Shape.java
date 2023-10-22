/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package kasus2;

/**
 *
 * @author Muhammad Syaifullah
 */
public abstract class Shape {
    private String shapeName;

    public Shape(String shapename) {
            this.shapeName = shapename;
    }

    public abstract double area();
    public String toString() {
            String Result = "Shape Name " + this.shapeName;
            return Result;
    }

}
