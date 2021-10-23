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
    private static final int LAGARTO = 3;
    private static final int SPOKE = 4;
    public static final List<Integer> OPCION = Arrays.asList(PIEDRA, PAPEL, TIJERA, LAGARTO, SPOKE);

    public Game() {
    }

    public String jugar(int jugada, int jugadaCPU) {
        if ((jugada == PIEDRA && jugadaCPU == TIJERA && jugadaCPU == LAGARTO ) ||
            (jugada == PAPEL && jugadaCPU == PIEDRA && jugadaCPU == SPOKE) ||
            (jugada == TIJERA && jugadaCPU == PAPEL && jugadaCPU == LAGARTO)||
            (jugada == LAGARTO && jugadaCPU == SPOKE && jugadaCPU == PAPEL)||
            (jugada == SPOKE && jugadaCPU == PIEDRA && jugadaCPU == TIJERA)) {
            partidasGanadasJugador++;
            return "!IMPOSIBLE ME GANASTE.....!  \nFelicidades ganaste "+getNombreJugador();
        } else if(jugada == jugadaCPU){
            partidasEmpatadas++;
            return "!EN LA GUERRA EL EMPATE CONLLEVA A LA DERROTA! \n Sigue intentando";
        }else {
            partidasGanadasCPU++;
            return "!MEJOR SUERTE PARA LA PROXIMA! "+"\nGana la CPU";
        }
    }


    public int jugadaCPU() {
        int JugadaCPU = new Random().nextInt(5);
        return JugadaCPU;
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
