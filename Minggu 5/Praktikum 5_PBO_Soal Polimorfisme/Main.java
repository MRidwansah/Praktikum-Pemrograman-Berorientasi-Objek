/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum6;

/**
 *
 * @author MyBook Hype AMD
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produk> produkList = new ArrayList<>();
        produkList.add(new Buku("Buku Cara mencintai diri sendiri", 200000));
        produkList.add(new Elektronik("Handphone Asus ROG", 9000000));
        produkList.add(new Pakaian("Baju Naruto Shippuden", 300000));

        KeranjangBelanja keranjang = new KeranjangBelanja(produkList);

        System.out.println("Keranjang Belanja:");
        keranjang.displayKeranjang();
    }
}