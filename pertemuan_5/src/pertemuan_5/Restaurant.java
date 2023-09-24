/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author Muhammad Syaifullah
 */

public class Restaurant {
    private Menu[] menuMakanan = new Menu[10];
    private byte id = 0;
    private double totalHarga = 0;

    public void addMakanan(String namaMakanan, double hargaMakanan, int stok) {
        if (id < menuMakanan.length) {
            Menu newItem = new Menu();
            newItem.setNamaMakanan(namaMakanan);
            newItem.setHargaMakanan(hargaMakanan);
            newItem.setStok(stok);
            menuMakanan[id] = newItem;
            id++;
        } else {
            System.out.println("Menu is full. Cannot add more items.");
        }
    }

    public void tampilMenuMakanan() {
        for (byte i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(menuMakanan[i].getNamaMakanan() + " [" + menuMakanan[i].getStok() + "] =" + menuMakanan[i].getHargaMakanan());
            }
        }
    }

    public boolean isOutOfStock(byte i) {
        return menuMakanan[i].getStok() == 0;
    }


public void pesanMakanan(String namaMakanan, int jumlah) {
        for (byte i = 0; i < id; i++) {
            if (menuMakanan[i].getNamaMakanan().equals(namaMakanan)) {
                if (menuMakanan[i].getStok() >= jumlah) {
                    menuMakanan[i].setStok(menuMakanan[i].getStok() - jumlah);
                    double hargaItem = menuMakanan[i].getHargaMakanan() * jumlah;
                    totalHarga += hargaItem;
                    System.out.println("Total harga: " + totalHarga);
                } else {
                    System.out.println("Stok tidak ada.");
                }
                return;
            }
        }
        System.out.println("Menu " + namaMakanan + " tidak ditemukan.");
    }
}
