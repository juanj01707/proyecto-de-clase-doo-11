package poo.desafio2.dominio;

public class Freelance extends Empleado{
    private long valorHora;
    private int horasTrabajadas;
    public Freelance(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas=horasTrabajadas;
        this.valorHora=valorHora;
    }

    @Override
    public long calcularSalario() {
        return valorHora*horasTrabajadas;
    }

}
