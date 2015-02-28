/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea1videoclub;

/**
 *
 * @author Kimberly
 */
public class Pelicula {
    // atributos de la clase
    private String genero;
    private int anno;
    private String nombre;
    private int numeroCopias;
    private String ID;

    // constructor completo
    public Pelicula(String genero, int anno, String nombre, int numeroCopias, String ID) {
        this.genero = genero;
        this.anno = anno;
        this.nombre = nombre;
        this.numeroCopias = numeroCopias;
        this.ID = ID;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCopias() {
        return numeroCopias;
    }

    public void setNumeroCopias(int numeroCopias) {
        this.numeroCopias = numeroCopias;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "genero=" + genero + ", anno=" + anno + ", nombre=" + nombre + ", numeroCopias=" + numeroCopias + ", ID=" + ID + '}';
    }
    
    
    
}
