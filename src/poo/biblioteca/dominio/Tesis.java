package poo.biblioteca.dominio;

public class Tesis extends Recurso implements Copiable {


    public Tesis(String nombre, boolean prestado, int copias) {
        super(nombre, prestado, copias);
    }

    @Override
    public void fotocopiar() {
        super.setCopias(0);
    }
}
