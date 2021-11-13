package poo.interfaces2.app;

import poo.interfaces2.dominio.*;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus antivirus = new Antivirus("AVG");

        DocumentoPDF pdf = new DocumentoPDF("ensayo.pdf", false);
        DocumentoWord word = new DocumentoWord("carta.docx", 1200);
        Cancion cancion = new Cancion("La canción", 254);
        Juego juego = new Juego("DOOM", "facil");
        Video video = new Video("Fuck Master 5000",3 );

        antivirus.agregar(pdf, word, cancion, juego,video);
        antivirus.escanear();
    }
}
