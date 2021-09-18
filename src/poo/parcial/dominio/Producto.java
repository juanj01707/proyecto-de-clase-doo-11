package poo.parcial.dominio;

public class Producto {
    private String nombre;
    private int precio;
    private String tipo;

    public Producto(String nombre, int precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
