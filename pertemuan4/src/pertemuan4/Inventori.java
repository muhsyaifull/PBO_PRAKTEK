/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Muhammad Syaifullah
 */

public class Inventori {
    Barang[] barangs;

    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 25);
        barangs[1] = new Barang("002", "Celana",12);
    }

    public void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getstok()+ ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getstok()+ ")");
    }

    void pengadaan() {
        initBarang();
        barangs[0].setstok(20);
        barangs[1].setstok(10);
//           barangs[0].stok += 20;
//           barangs[0].stok -= 30; //Bisa juga dikurangi dong?
//           barangs[0].stok *= 30; //dikali juga bisa dong??
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
