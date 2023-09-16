/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Muhammad Syaifullah
 */

class Laptop {
    public void boot() {
        System.out.println("Laptop dinyalakan.");
    }
}

class Gamer {
    public void playGame(Laptop laptop) {
        laptop.boot();
        System.out.println("Gamer sedang beremain game");
    }
}

public class nyoba {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Gamer gamer = new Gamer();
        gamer.playGame(laptop);
    }
}
