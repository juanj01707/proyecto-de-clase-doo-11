package poo.biblioteca.dominio;

public class Revista extends Recurso implements Prestable{


    public Revista(String nombre, boolean prestado, int copias) {
        super(nombre, prestado, copias);
    }

    @Override
    public void prestar() {
        super.setPrestado(true);
    }

    @Override
    public void devolver() {
        super.setPrestado(false);
    }
}
