package poo.interfaces2.dominio;

import poo.interfaces2.dominio.Viruseable;

public class Cancion implements Viruseable {
    private String nombre;
    private int calidad;

    public Cancion(String nombre, int calidad) {
        this.nombre = nombre;
        this.calidad = calidad;
    }

    @Override
    public boolean tieneVirus() {
        return this.calidad < 128 ? true : false;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public int getCalidad() {
        return calidad;
    }
}
