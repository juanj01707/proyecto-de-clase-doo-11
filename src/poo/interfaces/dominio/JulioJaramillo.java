package poo.interfaces.dominio;

public class JulioJaramillo extends Musico implements Guitarrista, Cantante {
    public JulioJaramillo() {
        super("Julio Jaramillo");
    }

    @Override
    public void tocarGuitarra() {
        System.out.println(this.nombre + " está tocando en su guitarra Nuestro Juramento.");
    }

    @Override
    public void cantar() {
        System.out.println(this.nombre + " está cantando Cuando llora mi guitarra.");
    }
}
