package poo.taller.punto1.domain;

import java.util.List;

public class Nota {
    public static final double PORC_SEGUIMIENTO = 0.4;
    public static final double PORC_FINAL = 0.3;
    public static final double PORC_PARCIAL = 0.3;

    private double notaParcial;
    private double notaFinal;
    private List<Double> notasSeguimiento;
    private Asignatura materia;

    public Nota(Asignatura materia) {
        this.materia = materia;
    }

    private double calcularSeguimiento() {
        double sumaNotas = 0;

        for (Double nota: this.notasSeguimiento) {
            sumaNotas += nota;
        }

        return sumaNotas / this.notasSeguimiento.size();
    }

    public double calcularDefinitiva() {
        return (this.notaParcial * PORC_PARCIAL) +
                (this.notaFinal * PORC_FINAL) +
                (calcularSeguimiento() * PORC_SEGUIMIENTO);
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public List<Double> getNotasSeguimiento() {
        return notasSeguimiento;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setNotasSeguimiento(List<Double> notasSeguimiento) {
        this.notasSeguimiento = notasSeguimiento;
    }
}
