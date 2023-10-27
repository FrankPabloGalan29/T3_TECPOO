/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_INTERFACES;

/**
 *
 * @author Frank
 */
public class Blusa extends Ropa {
    private String tipoBlusa;

    public Blusa(String nombre, double precio, String talla, String estilo) {
        super(nombre, precio, talla);
        this.tipoBlusa = estilo;
    }

    @Override
    public String obtenerTipo() {
        return "Ropa Blusa";
    }
}

