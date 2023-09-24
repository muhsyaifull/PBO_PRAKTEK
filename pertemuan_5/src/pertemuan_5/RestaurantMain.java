/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author Muhammad Syaifullah
 */

public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    // TODO code application logic here
    Restaurant menu = new Restaurant();
    menu.addMakanan("Tahu", 7_000, 10);
    menu.addMakanan("Gehu", 7_000, 10);
    menu.addMakanan("Siomay", 7_000, 10);
    menu.addMakanan("Basreng", 7_000, 10);

    System.out.println("Daftar Menu Makanan:");
    menu.tampilMenuMakanan();

    System.out.println(); // Ini akan menambahkan baris kosong

    menu.pesanMakanan("Tahu", 5);
    menu.pesanMakanan("Siomay", 8);
    menu.pesanMakanan("Basreng", 4);

    System.out.println(); // Ini akan menambahkan baris kosong

    System.out.println("Daftar Menu Makanan :");
    menu.tampilMenuMakanan();
    }
}

