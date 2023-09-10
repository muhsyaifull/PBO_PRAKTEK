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
public class Soal5 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String[] nomorPlat = new String[4];
        
        for (int i = 0; i < 4; i++) {
            nomorPlat[i] = scanner.next();
        }
        
        String gabung = String.join("", nomorPlat);
        long angka = Long.parseLong(gabung);
                
        if (((angka - 999999) % 5) == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
    
}
