package YanKenPo.dominio;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {
    private String nombreJugador;
    private int partidasGanadasJugador;
    private int partidasGanadasCPU;
    private int partidasEmpatadas;
    private static final int PIEDRA = 0;
    private static final int PAPEL = 1;
    private static final int TIJERA = 2;
    public static final List<Integer> OPCION = Arrays.asList(PIEDRA, PAPEL, TIJERA);

    public Game() {

    }

    public int jugadaCPU() {
        int JugadaCPU = new Random().nextInt(3);
        return JugadaCPU;
    }

    public String jugar(int jugada, int jugadaCPU) {
        if (jugada == PIEDRA && jugadaCPU == TIJERA) {
            partidasGanadasJugador++;
            return "!IMPOSIBLE!  \nFelicidades ganaste "+getNombreJugador();
        } else if (jugada == PAPEL && jugadaCPU == PIEDRA) {
            partidasGanadasJugador++;
            return "!IMPOSIBLE!  \nFelicidades ganaste "+getNombreJugador();
        } else if (jugada == TIJERA && jugadaCPU == PAPEL) {
            partidasGanadasJugador++;
            return "!IMPOSIBLE!  \nFelicidades ganaste"+getNombreJugador();
        } else if(jugada == jugadaCPU){
            partidasEmpatadas++;
            return "!EN LA GUERRA EL EMPATE CONLLEVA A LA DERROTA! \n Sigue intentando";
        }else {
            partidasGanadasCPU++;
            return "Mejor suerte para la proxima"+"\nGana la CPU";
        }
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getPartidasGanadasJugador() {
        return partidasGanadasJugador;
    }

    public void setPartidasGanadasJugador(int partidasGanadasJugador) {
        this.partidasGanadasJugador = partidasGanadasJugador;
    }

    public int getPartidasGanadasCPU() {
        return partidasGanadasCPU;
    }

    public void setPartidasGanadasCPU(int partidasGanadasCPU) {
        this.partidasGanadasCPU = partidasGanadasCPU;
    }

    public int getPartidasEmpatadas() {
        return partidasEmpatadas;
    }

    public void setPartidasEmpatadas(int partidasEmpatadas) {
        this.partidasEmpatadas = partidasEmpatadas;
    }
}
