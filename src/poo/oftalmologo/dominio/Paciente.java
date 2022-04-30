package poo.oftalmologo.dominio;

public abstract class Paciente {
    private String nombre;
    private int edad;
    private boolean necesitaCirugia;
    private String calidadVision;

    public Paciente(String nombre, int edad, boolean necesitaCirugia, String calidadVision) {
        this.nombre = nombre;
        this.edad = edad;
        this.necesitaCirugia = necesitaCirugia;
        this.calidadVision = calidadVision;
    }

    public boolean isNecesitaCirugia() {
        return necesitaCirugia;
    }
    public void setNecesitaCirugia(boolean necesitaCirugia) {
        this.necesitaCirugia = necesitaCirugia;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    public String getCalidadVision() {
        return calidadVision;
    }

    public void setCalidadVision(String calidadVision) {
        this.calidadVision = calidadVision;
    }
}
