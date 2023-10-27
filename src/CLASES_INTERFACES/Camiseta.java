/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_INTERFACES;

/**
 *
 * @author Frank
 */
public class Camiseta extends Ropa {
    private String tipoCamiseta;

    public Camiseta(String nombre, double precio, String talla, String tipoManga) {
        super(nombre, precio, talla);
        this.tipoCamiseta = tipoManga;
    }

    @Override
    public String obtenerTipo() {
        return "Camiseta";
    }
}
