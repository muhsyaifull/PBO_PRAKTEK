/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package kasus2;
import java.text.DecimalFormat;

/**
 *
 * @author Muhammad Syaifullah
 */
public class PaintThings {

    public static void main(String[] args) {
            // TODO Auto-generated method stub
            final double coverage = 350;
            Paint paint = new Paint(coverage);

            Rectangle deck = new Rectangle(20,30);
            Sphere bigBall = new Sphere(15);
            Cylinder tank = new Cylinder(10,30);

            double deckamt, ballamt,tankamt;

            deckamt = paint.amount(deck);
            ballamt = paint.amount(bigBall);
            tankamt = paint.amount(tank);

            DecimalFormat fmt = new DecimalFormat("0.#");
            System.out.println("\nNumber of gallons of paint needed...");
            System.out.println("Deck " + fmt.format(deckamt));
            System.out.println("BigBall " + fmt.format(ballamt));
            System.out.println("Tank " + fmt.format(tankamt));
    }

}
