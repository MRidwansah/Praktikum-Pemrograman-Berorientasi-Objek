/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

import java.time.LocalDate;

/**
 *
 * @author acer
 */
public class Makanan extends Produk {
    private LocalDate tanggalKadaluarsa;
    
    public Makanan(String namaProduk, int harga, LocalDate tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    public LocalDate getTanggalKadaluarsa() {  // Getter
        return tanggalKadaluarsa;
    }
    
    public void setTanggalKadaluarsa(LocalDate tanggalKadaluarsa) {   // Setter
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}