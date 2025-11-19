/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11_TugasModul;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {
    public static void main(String[] args) {

        Pengarang pengarang1 = new Pengarang("Pidi Baiq");
        Pengarang pengarang2 = new Pengarang("Habiburrahman El Shirazy");

        Buku buku1 = new Buku("Dilan: Dia adalah Dilanku Tahun 1990", pengarang1);
        Buku buku2 = new Buku("Ayat-Ayat Cinta", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        System.out.println("\n--- Informasi Perpustakaan ---");
        perpustakaan.tampilkanBuku();
    }
}