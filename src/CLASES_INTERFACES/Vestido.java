/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_INTERFACES;

/**
 *
 * @author Frank
 */
public class Vestido extends Ropa {
    private String tipoVestido;

    public Vestido(String nombre, double precio, String talla, String tipoVestido) {
        super(nombre, precio, talla);
        this.tipoVestido = tipoVestido;
    }

    @Override
    public String obtenerTipo() {
        return "Vestido";
    }
}

