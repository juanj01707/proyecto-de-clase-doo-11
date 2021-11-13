package poo.interfaces2.dominio;

public class DocumentoWord extends Documento {
    private int nroLineas;

    public DocumentoWord(String nombre, int nroLineas) {
        super(nombre);
        this.nroLineas = nroLineas;
    }

    @Override
    public boolean tieneVirus() {
        return this.nroLineas < 1000;
    }

    public int getNroLineas() {
        return nroLineas;
    }
}
