/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum11;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {
    public static void main(String[] args) {

        Buku buku1 = new Buku("Ultraman Dyna");
        Buku buku2 = new Buku("Ultraman Cosmos");
        Buku buku3 = new Buku("Ultraman Tiga");

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        System.out.println("Informasi Perpustakaan:");
        perpustakaan.infoPerpustakaan();

        Anggota anggota1 = new Anggota("Ilham");
        Anggota anggota2 = new Anggota("Thoher");
        Anggota anggota3 = new Anggota("Ahmada");

        Klub klub = new Klub("Red Pyhton ");
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.tambahAnggota(anggota3);

        System.out.println("\nInformasi Klub:");
        klub.infoKlub();
    }
}