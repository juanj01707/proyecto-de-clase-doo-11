package poo.interfaces.dominio;

public class Slash extends Musico implements Guitarrista {
    public Slash() {
        super("Slash");
    }

    @Override
    public void tocarGuitarra() {
        System.out.println(this.nombre + " está tocando la guitarra para GNR....");
    }
}
