package poo.desafio2.dominio;


public abstract class Empleado {
    public String getNombre() {
        return nombre;
    }

    private String nombre;
    public Empleado(String nombre){
        this.nombre=nombre;
    }
    public abstract long calcularSalario();

}
