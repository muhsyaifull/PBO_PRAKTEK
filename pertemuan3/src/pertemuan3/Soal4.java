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
public class Soal4 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahJual = scanner.nextInt();
        int gajiPokok = 500000;
        int harga = 50000;
        int totalgaji = 0;
        
        if (jumlahJual >= 80)
        {
            totalgaji = gajiPokok + (jumlahJual * harga) * 35/100;
        } else if (jumlahJual >= 40)
        {
            totalgaji = gajiPokok + (jumlahJual * harga) * 25/100;
        } else if (jumlahJual < 15)
        {
            totalgaji = gajiPokok - (((15 - jumlahJual) * harga) * 15/100);
        } else
        {
            totalgaji = gajiPokok + (jumlahJual * harga) * 10/100;
        }
        System.out.println(totalgaji);
    }
}
