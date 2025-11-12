/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum10;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Elektronik
        Pembayaran ps4 = new Elektronik();
        double hargaPS4 = 3000000;
        double pajakPS4 = ps4.hitungPajak(hargaPS4);
        double totalPS4 = hargaPS4 + pajakPS4;

        // Membuat objek Makanan
        Pembayaran nasiGoreng = new Makanan();
        double hargaNasiGoreng = 20000;
        double pajakNasiGoreng = nasiGoreng.hitungPajak(hargaNasiGoreng);
        double totalNasiGoreng = hargaNasiGoreng + pajakNasiGoreng;

        // Menampilkan hasil perhitungan untuk Elektronik
        System.out.println("PRODUK ELEKTRONIK");
        System.out.println("Nama Produk: Playstation 4");
        System.out.println("Harga Produk: Rp " + hargaPS4);
        System.out.println("Pajak (10%): Rp " + pajakPS4);
        System.out.println("Total Bayar: Rp " + totalPS4);

        // Menampilkan hasil perhitungan untuk Makanan
        System.out.println("\nPRODUK MAKANAN");
        System.out.println("Nama Produk: Nasi Goreng");
        System.out.println("Harga Produk: Rp " + hargaNasiGoreng);
        System.out.println("Pajak (5%): Rp " + pajakNasiGoreng);
        System.out.println("Total Bayar: Rp " + totalNasiGoreng);
    }
}