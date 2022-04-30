package poo.oftalmologo.dominio;

public class PacienteApto extends Paciente implements Operable{

    public PacienteApto(String nombre, int edad, boolean necesitaCirugia, String calidadVision) {
        super(nombre, edad, necesitaCirugia, calidadVision);
    }

    @Override
    public void operar() {
        super.setNecesitaCirugia(false);
        super.setCalidadVision("20/20");
    }


}
