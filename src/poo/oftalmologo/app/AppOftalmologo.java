package poo.oftalmologo.app;

import poo.oftalmologo.dominio.Oftalmologo;
import poo.oftalmologo.dominio.PacienteApto;
import poo.oftalmologo.dominio.PacienteNoApto;

public class AppOftalmologo {
    public static void main(String[] args) {
        Oftalmologo oftalmologo = new Oftalmologo("Fabio leon rodriguez");

        PacienteApto juan = new PacienteApto("Juan",20,true);
        PacienteApto yorlady = new PacienteApto("Yorlady",45,true);
        PacienteApto ana = new PacienteApto("Ana",65,true);
        PacienteNoApto lorena = new PacienteNoApto("Lore",38,true);

        oftalmologo.agregarPaciente(juan,yorlady,ana,lorena);

    }

}
