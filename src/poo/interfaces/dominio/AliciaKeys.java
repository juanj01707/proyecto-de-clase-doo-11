package poo.interfaces.dominio;

public class AliciaKeys extends Musico implements Cantante, Pianista {
        public AliciaKeys() {
                super("Alicia Keys");
        }

        @Override
        public void cantar() {
                System.out.println(this.nombre + " está cantando No One.");
        }

        @Override
        public void tocarPiano() {
                System.out.println(this.nombre + " está tocando en su piano NY state of mind.");
        }
}
