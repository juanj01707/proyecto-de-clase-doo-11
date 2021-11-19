package poo.biblioteca.dominio;

public abstract class Recurso {
    private String nombre;
    private boolean prestado;
    private int copias;

    public Recurso(String nombre, boolean prestado, int copias) {
        this.nombre = nombre;
        this.prestado = prestado;
        this.copias = copias;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = false;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = 0;
    }
}
