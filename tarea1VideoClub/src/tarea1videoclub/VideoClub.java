/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea1videoclub;

import java.util.ArrayList;

/**
 *
 * @author Kimberly
 */
public class VideoClub {
    private String nombre;
    private  String ubicacion;
    private ArrayList<Pelicula> listaPelis;

    public VideoClub(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaPelis = new ArrayList<Pelicula>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void agregarPelicula(Pelicula nuevaPeli) {
        this.listaPelis.add(nuevaPeli);
    }
    
    public ArrayList<Pelicula> obtenerListaPeliculas(){
        return listaPelis;
    }
    
    
}
