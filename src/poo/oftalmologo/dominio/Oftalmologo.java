package poo.oftalmologo.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oftalmologo {
    private String nombre;
    private List<Paciente> pacientes;
    private Object PacienteApto;
    private Object PacienteNoApto;
    public static final int EDAD_MAXIMA = 40;


    public Oftalmologo(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
    }

    public Paciente revisarPaciente(String nombre, int edad){
        if(nombre.contains("a") == true || nombre.contains("A") == true && edad<EDAD_MAXIMA){
            System.out.println("Paciente "+nombre+" con "+edad+" año es un paciente apto para ser operado...");
            return (Paciente) PacienteApto;
        }else{
            System.out.println("Paciente "+nombre+" no es apto para ser operado");
            return (Paciente) PacienteNoApto;
        }
    }

    public void operarPacientes(){
        this.pacientes.forEach(paciente -> {
           if(paciente instanceof Operable){
               ((Operable) paciente).operar();
           }
        });
    }


    /*public List<PacienteApto> getPacientesAOperar() {
            List<Paciente> pacientesAptos = pacientes.stream().filter(paciente -> paciente instanceof PacienteApto && paciente.isNecesitaCirugia() == true).collect(Collectors.toList());
            return pacientesAptos;
    }*/

    public void agregarPaciente(Paciente... p){
        this.pacientes.addAll(Arrays.asList(p));
    }

}
