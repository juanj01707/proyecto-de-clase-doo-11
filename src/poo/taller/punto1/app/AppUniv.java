package poo.taller.punto1.app;

import poo.taller.punto1.domain.Asignatura;
import poo.taller.punto1.domain.Docente;
import poo.taller.punto1.domain.Estudiante;
import poo.taller.punto1.domain.Nota;

import java.util.Arrays;

public class AppUniv {
    public static void main(String[] args) {
        Docente profe = new Docente("1234", "Alejo Ramirez");
        Asignatura poo = new Asignatura("POO", profe);

        System.out.println("Estudiantes antes " + Estudiante.getNroEstudiantes());

        Estudiante lema = Estudiante.matricular("34546", "Alejandro Lema");
        Estudiante melanie = Estudiante.matricular("46564", "Melanie Giraldo");
        Estudiante david = Estudiante.matricular("68790", "David Ayala");
        Estudiante pepito = Estudiante.matricular("68790", "Pepito");
        Estudiante pablito = Estudiante.matricular("68790", "Pablito");
        Estudiante johana = Estudiante.matricular("34", "Joha");

        System.out.println(pablito);
        System.out.println(johana);

        System.out.println("Estudiantes después " + Estudiante.getNroEstudiantes());

        // lema
        Nota notaLema = new Nota(poo);
        notaLema.setNotaParcial(3);
        notaLema.setNotaFinal(4.7);
        notaLema.setNotasSeguimiento(Arrays.asList(5.0, 1.0, 2.5, 4.0, 3.2));
        lema.setNota(notaLema);

        // melanie
        Nota notaMelanie = new Nota(poo);
        notaMelanie.setNotaParcial(4);
        notaMelanie.setNotaFinal(3.2);
        notaMelanie.setNotasSeguimiento(Arrays.asList(3.2, 2.5, 4.5, 2.0, 4.2));
        melanie.setNota(notaMelanie);

        // david
        Nota notaDavid = new Nota(poo);
        notaDavid.setNotaParcial(5);
        notaDavid.setNotaFinal(4.0);
        notaDavid.setNotasSeguimiento(Arrays.asList(4.2, 2.9, 4.5, 5.0, 4.7));
        david.setNota(notaDavid);

        poo.getEstudiantes().add(lema);
        poo.getEstudiantes().add(melanie);
        poo.getEstudiantes().add(david);

        calcularDefinitivaDelCurso(poo);
    }

    private static void calcularDefinitivaDelCurso(Asignatura curso) {
        for (Estudiante estudiante: curso.getEstudiantes()) {
            double definitiva = estudiante.getNota().calcularDefinitiva();

            if (definitiva < 3) {
                System.out.println(estudiante.getNombre() + " perdió " + curso.getNombre() + " porque sacó " + definitiva);
            } else {
                System.out.println(estudiante.getNombre() + " GANÓ " + curso.getNombre() + " porque sacó " + definitiva + " 🚀");
            }
        }
    }
}
