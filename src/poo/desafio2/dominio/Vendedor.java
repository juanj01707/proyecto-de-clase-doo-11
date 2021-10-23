package poo.desafio2.dominio;

public class Vendedor extends Directo {
    private long VentaDelMes;



    public Vendedor(String nombre, long salario, long ventaDelMes) {
        super(nombre, salario);
        this.VentaDelMes = ventaDelMes;

    }
    public long calcularComision(){
        long saldo=0;
        if (getSalario()>=999999){
            saldo=(long)(VentaDelMes*0.05);
        }else{
            saldo=(long)(VentaDelMes*0.045);
        }
        return saldo;
    }

    @Override
    public long calcularSalario() {
        return this.getSalario()+calcularComision()-(calcularPension()+calcularSalud());
    }


}
