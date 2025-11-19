/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11_TugasModul;

/**
 *
 * @author MyBook Hype AMD
 */
import java.util.List;
import java.util.ArrayList;
import praktikum11_TugasModul.Buku;

class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void tampilkanBuku() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}