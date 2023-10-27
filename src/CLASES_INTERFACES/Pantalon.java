/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_INTERFACES;

/**
 *
 * @author Frank
 */
public class Pantalon extends Ropa {
    private String tipoPantalon; // Puede ser "Vaquero", "Deportivo", etc.

    public Pantalon(String nombre, double precio, String talla, String tipoPantalon) {
        super(nombre, precio, talla);
        this.tipoPantalon = tipoPantalon;
    }

    @Override
    public String obtenerTipo() {
        return "Pantalón";
    }
}
