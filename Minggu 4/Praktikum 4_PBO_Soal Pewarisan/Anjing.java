/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author MyBook Hype AMD
 */
public class Anjing extends Hewan {
    String suara;
    
    @Override
    public void InfoHewan() {
        super.InfoHewan();
        System.out.println("Suara anjing: " + suara);
    }
}