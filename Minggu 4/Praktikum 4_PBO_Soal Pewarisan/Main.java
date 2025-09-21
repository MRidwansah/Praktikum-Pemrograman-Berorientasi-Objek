/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum5;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Pia";
        kucing.jenis = "Anggora";
        kucing.suara = "Meong";
        System.out.println("Info Kucing");
        kucing.InfoHewan();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Suki";
        anjing.jenis = "Polisi";
        anjing.suara = "Gok-Gok";
        System.out.println("\nInfo Anjing");
        anjing.InfoHewan();
    }
}