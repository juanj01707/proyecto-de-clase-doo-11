package poo.interfaces.app;

import poo.interfaces.dominio.AliciaKeys;
import poo.interfaces.dominio.Cantante;
import poo.interfaces.dominio.Guitarrista;
import poo.interfaces.dominio.JulioJaramillo;
import poo.interfaces.dominio.Maraquero;
import poo.interfaces.dominio.Musico;
import poo.interfaces.dominio.PastorLopez;
import poo.interfaces.dominio.Pianista;
import poo.interfaces.dominio.RubenBlades;
import poo.interfaces.dominio.Slash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicaApp {
    public static void main(String[] args) {
        JulioJaramillo julio = new JulioJaramillo();
        AliciaKeys alicia = new AliciaKeys();
        RubenBlades rubenBlades = new RubenBlades();
        Slash slash = new Slash();
        PastorLopez donPastor = new PastorLopez();

        List<Musico> musicos = new ArrayList<>(Arrays.asList(donPastor, julio, alicia, rubenBlades, slash));

        musicos.forEach(musico -> {
            if (musico instanceof Cantante) {
                ((Cantante) musico).cantar();
            }

            if (musico instanceof Guitarrista) {
                ((Guitarrista) musico).tocarGuitarra();
            }

            if (musico instanceof Maraquero) {
                ((Maraquero) musico).tocarMaracas();
            }

            if (musico instanceof Pianista) {
                ((Pianista) musico).tocarPiano();
            }
        });
    }
}
