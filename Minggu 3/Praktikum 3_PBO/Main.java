/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("CRV", 180, "Bensin", 4);
        Mobil mobil2 = new Mobil("Pajero", 200, "Diesel", 4);
        Mobil mobil3 = new Mobil("Tesla", 240, "Listrik", 4);

        System.out.println("=== Data Mobil 1 ===");
        mobil1.tampilkanInfoMobil();

        System.out.println("\n=== Data Mobil 2 ===");
        mobil2.tampilkanInfoMobil();

        System.out.println("\n=== Data Mobil 3 ===");
        mobil3.tampilkanInfoMobil();
    }
}