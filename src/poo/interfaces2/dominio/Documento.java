package poo.interfaces2.dominio;

import poo.interfaces2.dominio.Viruseable;

public abstract class Documento implements Viruseable {
    protected String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
