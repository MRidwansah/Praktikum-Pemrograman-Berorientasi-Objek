/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum9;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {
    public static void main(String[] args) {
        Hewan Kucing = new Kucing();
        Hewan Anjing = new Anjing();
        
        Kucing.suara();
        Kucing.info();
        
        Anjing.suara();
        Anjing.info();
    }
}