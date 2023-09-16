/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Muhammad Syaifullah
 */

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk) {
         kode_barang = kode;
         nama_barang = nama;
         stok = stk;
    }

    public int getstok () {
        return this.stok;
    }
    
    public int setstok(int nilai){
        return this.stok += nilai;
    }
}