package poo.oftalmologo.app;

import poo.oftalmologo.dominio.Oftalmologo;
import poo.oftalmologo.dominio.PacienteApto;
import poo.oftalmologo.dominio.PacienteNoApto;

public class AppOftalmologo {
    public static void main(String[] args) {
        Oftalmologo oftalmologo = new Oftalmologo("Fabio leon rodriguez");

        PacienteApto juan = new PacienteApto("Juan",20,true, "0/0");
        PacienteApto yorlady = new PacienteApto("Yorlady",45,true,"20/20");
        PacienteNoApto ana = new PacienteNoApto("Ana",65,true,"10/10");
        PacienteApto lorena = new PacienteApto("Lore",38,true,"10/10");

        oftalmologo.agregarPaciente(juan,yorlady,ana,lorena);


    }

}
