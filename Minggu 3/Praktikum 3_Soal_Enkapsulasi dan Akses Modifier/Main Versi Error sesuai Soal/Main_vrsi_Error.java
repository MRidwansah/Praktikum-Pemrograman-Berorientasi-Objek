/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author MyBook Hype AMD
 */
public class Main_vrsi_Error {
    public static void main(String[] args) {
        Pekerja Adna = new Pekerja("Ultrawoman Piaa", 20, "Membasmi Monster", 1000000000);

        // Coba akses langsung atribut
        System.out.println("Nama: " + Adna.nama);   // ERROR, karena 'nama' private di Manusia
        System.out.println("Usia: " + Adna.usia);   // ERROR, 'usia' protected → tidak bisa diakses dari class Main (beda hubungan)
        System.out.println("Gaji: " + Adna.gaji);   // ERROR, karena 'gaji' private di Pekerja
    }
}