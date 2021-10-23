package YanKenPo.app;

import YanKenPo.dominio.Game;
import javax.swing.*;
import java.util.Arrays;

public class AppGame {
    private static ImageIcon icono = new ImageIcon("C:\\Users\\JUAN JOSE DIAZ E\\Pictures\\IMGPOO\\Spock.jpg");
    private static ImageIcon icono2 = new ImageIcon("C:\\Users\\JUAN JOSE DIAZ E\\Pictures\\IMGPOO\\Sheldon.png");
    //private static ImageIcon iconoPiedra = new ImageIcon("C:\\Users\\JUAN JOSE DIAZ E\\Pictures\\IMGPOO\\yan.jpg");
    //private static ImageIcon iconoPapel = new ImageIcon("C:\\Users\\JUAN JOSE DIAZ E\\Pictures\\IMGPOO\\ken.jpg");
    //private static ImageIcon iconoTijeras = new ImageIcon("C:\\Users\\JUAN JOSE DIAZ E\\Pictures\\IMGPOO\\po.jpg");
    private static ImageIcon iconoNombre = new ImageIcon("C:\\Users\\JUAN JOSE DIAZ E\\Pictures\\IMGPOO\\enter.jpg");
    private static final int OPCION_JUGAR = 0;
    private static final int OPCION_REGLAS = 1;
    private static final int OPCION_PUNTUACION = 2;
    private static final int OPCION_NUEVO_JUGADOR = 3;

    public static String ingresarNombre(){
        String nombreJugador;
        do {
            nombreJugador =(String) JOptionPane.showInputDialog
                    (null,"¿Cuál es tu nombre? " );
            //(null,"Ingresar nombre","Nuevo jugador",0,iconoNombre);
        }while (nombreJugador == null || nombreJugador.trim().isEmpty());

        return nombreJugador;
    }

    public static String jugada(int jugada){
        if(jugada == 0){
            return "PIEDRA";
            //return "PIEDRA" + iconoPiedra;
        }else if(jugada == 1){
            return "PAPEL";
            //return "PAPEL" + iconoPapel;
        }else if(jugada == 2){
            return "TIJERA";
            //return "TIJERA"+ iconoTijera;
        }else if(jugada == 3){
            return "LAGARTO";
        }else {
            return "SPOKE";
        }
    }

    public static void main(String[] args) {
        Game juego = new Game();
        while(true){
            int opcionElegida = JOptionPane.showOptionDialog(null,
                    "!PIEDRA, PAPEL, TIJERA, LAGARTO, SPOKE!", "Juego ", 0, 0, icono,
                    Arrays.asList("Jugar", "Reglas", "Puntuacion", "Nuevo jugador").toArray(), null);

            switch (opcionElegida) {
                case OPCION_JUGAR:
                    if(juego.getNombreJugador() == null){
                        juego.setNombreJugador(ingresarNombre());
                    }
                    int jugadaCPU = juego.jugadaCPU();
                    int jugadaElegidaJugador = JOptionPane.showOptionDialog(null,"Seleccione: ",
                            "Juego",0,JOptionPane.QUESTION_MESSAGE,icono,
                            Arrays.asList("PIEDRA","PAPEL","TIJERA","LAGARTO","SPOKE").toArray(),null);

                    JOptionPane.showMessageDialog(null,juego.getNombreJugador()+
                            " Seleccionó: \n"+jugada(jugadaElegidaJugador)+ "\n"+"La CPU seleccionó: \n"+jugada(jugadaCPU));

                    String ganador = juego.jugar(jugadaElegidaJugador,jugadaCPU);
                    JOptionPane.showMessageDialog(null,ganador);
                    break;

                case OPCION_REGLAS:
                    JOptionPane.showMessageDialog(null,"REGLAS:\n \n  " +
                            "El objetivo es vencer al oponente seleccionando el arma que gana, según las siguientes reglas:\n \n \n "  +
                            "La Piedra aplasta la Tijera y aplasta al Lagarto. (Gana la piedra.) \n "+
                            "La Tijera corta el Papel y decapita al Lagarto. (Gana la tijera.) \n "+
                            "El papel envuelve la piedra y desautoriza a Spoke. (Gana el papel.) \n " +
                            "El Lagarto envenena a Spoke y come Papel. (Gana el Lagarto.) \n " +
                            "Spoke desintegra a la Piedra y aplasta a las tijeras. (Gana Spoke.) \n " +
                            "En caso de empate (que dos jugadores elijan el mismo elemento), se juega otra vez. \n\n ¡BUENA SUERTE!",
                            "Reglas",0,icono2);
                    break;

                case OPCION_PUNTUACION:
                    if(juego.getNombreJugador() == null){
                        JOptionPane.showMessageDialog(null,"No hay jugadores registrados \n"+"primeo ingresa un jugador");
                        juego.setNombreJugador(ingresarNombre());
                    }
                    JOptionPane.showMessageDialog(null,"¡TABLA DE PUNTUACIONES!" +
                            " \n "+juego.getNombreJugador()+": "+juego.getPartidasGanadasJugador()+
                            "\n CPU: "+juego.getPartidasGanadasCPU()+
                            "\n Partidas Empatadas: "+juego.getPartidasEmpatadas() );
                    break;
                case OPCION_NUEVO_JUGADOR:
                    juego.setNombreJugador(ingresarNombre());
                    juego.setPartidasGanadasJugador(0);
                    juego.setPartidasGanadasCPU(0);
                    juego.setPartidasEmpatadas(0);
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }
    }



}

