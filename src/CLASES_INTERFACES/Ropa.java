/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES_INTERFACES;

/**
 *
 * @author Frank
 */
public abstract class Ropa {
    
    private String nombre;
    private double precio;
    private String talla;

    public Ropa(String nombre, double precio, String talla) {
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    public abstract String obtenerTipo();
    
}
