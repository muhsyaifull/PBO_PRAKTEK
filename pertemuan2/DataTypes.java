/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.util.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Muhammad Syaifullah
 */
public class DataTypes {
     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Write Number :");
        int t = scanner.nextInt(); // jumlah kasus uji
         
        for (int i = 0; i < t; i++) {
            try {
                long n = scanner.nextLong(); // nilai integer untuk kasus uji ini
                System.out.println(n + " can be fitted in = ");
                
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
                } catch (Exception e) {
                   System.out.println(scanner.next() + " can't be fitted anywhere.");
                }
        }
        
        scanner.close();
    }
}

