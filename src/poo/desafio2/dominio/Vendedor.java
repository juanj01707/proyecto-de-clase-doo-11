package poo.desafio2.dominio;

public class Vendedor extends Directo {
    private long VentaDelMes;
    private long salario;


    public Vendedor(String nombre, long salario, long ventaDelMes) {
        super(nombre, salario);
        this.VentaDelMes = ventaDelMes;
        this.salario=salario;
    }
    public long calcularComision(){
        long saldo=0;
        if (salario>=999999){
            saldo=(long)(VentaDelMes*0.045);
        }else{
            saldo=(long)(VentaDelMes*0.055);
        }
        return saldo;
    }

    @Override
    public long calcularSalario() {

        return this.salario+calcularComision()-(calcularPension()+calcularSalud());
    }


}
