package poo.interfaces.dominio;

public class RubenBlades extends Musico implements Cantante, Maraquero, Guitarrista {
    public RubenBlades() {
        super("Ruben Blades");
    }

    @Override
    public void tocarGuitarra() {
        System.out.println(nombre + " toca la guitarra...");
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " está cantando Pedro Navaja.");
    }

    @Override
    public void tocarMaracas() {
        System.out.println(nombre + " está tocando maracas en Amor y control.");
    }
}
