/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.welcome;

/**
 *
 * @author Muhammad Syaifullah
 */
public class Welcome {

    public static void main(String[] args) {
        String greeting = "Welcome to Core Javs!";//inisiasi pesan
        System.out.println(greeting);// Menampilkan Pesan
        for (int i = 0; i < greeting.length(); i++)//jika for terpenuhi maka akan menampilkan "="
            System.out.print("=");// Menampilkan "="
        System.out.println();//Menampilkan baris kosong 
    }
}

