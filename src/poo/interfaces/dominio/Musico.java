package poo.interfaces.dominio;

public abstract class Musico {
    protected String nombre;

    public Musico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
