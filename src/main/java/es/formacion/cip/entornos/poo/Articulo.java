/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.formacion.cip.entornos.poo;

/**
 * Clase Articulo
 */
public class Articulo {
    private int id;
    private String nombre;
    private double precio;

    /**
     *Constructor de la clase articulo
     * @param id
     * @param nombre
     * @param precio
     */
    public Articulo(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Método toString de la clase artículo
     * @return
     */
    @Override
    public String toString() {
        return "Articulo: " +
                "Nombre:'" + nombre + '\'' +
                ", Precio: " + precio  ;
    }

    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }


    public double getPrecio() {
        return precio;
    }


}
