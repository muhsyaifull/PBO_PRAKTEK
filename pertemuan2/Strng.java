/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;



/**
 *
 * @author Muhammad Syaifullah
 */

import java.util.Scanner;

public class Strng {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        var A = sc.next();
        var B = sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(A.substring(0, 1).toUpperCase()
                + A.substring(1) + " " + B.substring(0, 1)
                        .toUpperCase() + B.substring(1));
    }
}
