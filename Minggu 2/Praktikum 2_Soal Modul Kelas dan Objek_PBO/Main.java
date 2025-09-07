/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Main {
   public static void main(String[] args) {
        Mobil MobilWan = new Mobil("Porsche", "Porsche 911", 2019, "Merah");
        Mobil MobilPia = new Mobil("Ferrari", "812 GTS", 2022, "Pink");
        
        MobilWan.displayInfo();
        MobilWan.setWarna("Hitam");
        MobilWan.displayInfo();
        
        MobilPia.displayInfo();
        MobilPia.setWarna("Putih");
        MobilPia.displayInfo();
        
        MobilWan.startEngine();
        MobilPia.startEngine();
    }
}