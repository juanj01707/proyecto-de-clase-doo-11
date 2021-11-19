package poo.biblioteca.dominio;

public class Libro extends Recurso implements Prestable, Copiable {


    public Libro(String nombre, boolean prestado, int copias) {
        super(nombre, prestado, copias);
    }




    @Override
    public void prestar(){
        super.setPrestado(true);
    }

    @Override
    public void devolver() {
        super.setPrestado(false);
    }

    @Override
    public void fotocopiar() {
        super.setCopias(super.getCopias()+1);

    }
}
