/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;
import java.util.Scanner;

/**
 *
 * @author Muhammad Syaifullah
 */

public class Soal1 {
    public static void main(String[] args) {
        String s = null;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
          
        String[] kata = s.split("[\\s,.?!'`]+");
        int jumlahKata = kata.length;
        
        System.out.println("");
        System.out.println(jumlahKata);
        for (String kata1 : kata) {
            System.out.println(kata1);
        }
    }
}
