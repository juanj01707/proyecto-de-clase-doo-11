package poo.interfaces2.dominio;

import poo.interfaces2.dominio.Viruseable;

public class Juego implements Viruseable {
    private String nombre;
    private String dificultad;

    public Juego(String nombre, String dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
    }

    @Override
    public boolean tieneVirus() {
        return this.dificultad.equalsIgnoreCase("facil");
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public String getDificultad() {
        return dificultad;
    }
}
