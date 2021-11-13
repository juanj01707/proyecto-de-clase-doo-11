package poo.interfaces2.dominio;

public class Video implements Viruseable{
    private String nombre;
    private int duracion;

    public Video(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    @Override
    public boolean tieneVirus() {
        return this.duracion < 40 ? true : false;
    }

    @Override
    public String getNombre() {
        return null;
    }
}
