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
public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();
        int hasil = 0;
       
        if (operand1 > 1 && operand1 <= 1000 && operand2 > 1 && operand2 <= 1000) {
            if (operator == '+') {
                hasil = operand1 + operand2;
            }
            if (operator == '-') {
                hasil = operand1 - operand2;
            }
            if (operator == '*') {
                hasil = operand1 * operand2;
            }
            if (operator == '/') {
                hasil = operand1 / operand2;
            }
            if (operator == '%') {
                hasil = operand1 % operand2;
            }
        }
        System.out.println(  hasil);
    }
}

