/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Muhammad Syaifullah
 */
public class Soal6 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        String operand1 = scanner.nextLine();
        String operand2 = scanner.nextLine();
        
        BigInteger A = new BigInteger (operand1);
        BigInteger B = new BigInteger (operand2);
      
        BigInteger penjumlahan = A.add(B);
        BigInteger perkalian = A.multiply(B);
        
        System.out.println(penjumlahan);
        System.out.println(perkalian);
    }
    
}
