/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author acer
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik("Laptop ASUS ROG GAMING", 15000000, 2);
        laptop.tampilkanInfo();
        
        System.out.println("");
        
        PegawaiTetap pegawai1 = new PegawaiTetap("Ridwan", 5000000, 1000000);
        pegawai1.tampilkanInfo();
        
        System.out.println("");
        
        Makanan snack = new Makanan("Sosis So Nice", 15000, LocalDate.of(2023, 12, 30));
        snack.tampilkanInfo();
        
        System.out.println("");
        
        PegawaiKontrak pegawai2 = new PegawaiKontrak("Piaa", 3000000, 12);
        pegawai2.tampilkanInfo();
    }
}