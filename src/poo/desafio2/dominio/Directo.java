package poo.desafio2.dominio;

public class Directo extends Empleado {
    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }
    public long calcularSalud(){
        return(long) (0.04*salario);
    }
    public long calcularPension(){
        return (long) (0.065*salario);
    }

    @Override
    public long calcularSalario() {
        return salario-(this.calcularPension()+this.calcularSalud());
    }

}



