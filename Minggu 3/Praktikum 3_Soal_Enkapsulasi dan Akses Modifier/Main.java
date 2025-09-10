/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {
    public static void main(String[] args) {
        Pekerja Adna = new Pekerja("Ultrawoman Piaa",20,"Membasmi Monster",1000000000);
        
        System.out.println("Informasi Pekerja:");
        System.out.println(Adna.toString());
        
        Adna.setNama("Ultraman Wann");
        System.out.println("\nInformasi setelah diperbarui:");
        System.out.println(Adna.toString());
    }
}