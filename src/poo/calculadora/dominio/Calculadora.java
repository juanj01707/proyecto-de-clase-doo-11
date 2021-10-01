package poo.calculadora.dominio;

import javax.swing.JOptionPane;


public class Calculadora {
    //private double number1 = 0.0;
    //private double number2 = 0.0;
    private double numero;
    private int n;
    private double resultado = 0.0;

    public Calculadora() {

    }




    public int ingresarN(){
        do{
            try{
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese con cuantos numeros quiere trabajar  "));
                if(n<1){
                    JOptionPane.showMessageDialog(null,"Numero ingresado no válido");
                }
            }catch (NumberFormatException ee){
                JOptionPane.showMessageDialog(null,"Numero ingresado no válido");
            }
        }while(n<1);
        return n;
    }

    public double ingresarNumeros(){
        do{
            try{
                double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero: "));
                return numero;
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(null,"Numero ingresado no valido");
                continue;
            }
        }while(true);
    }


    public double sumar(int n) {
        //this.number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        //this.number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        double suma=0;
        for(int i=0;i<n;i++){
            numero = ingresarNumeros();
            suma = suma+numero;
            resultado = suma;
        }
        Resultados(suma);
        return suma;


    }

    public double restar(int n) {
        //this.number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        //this.number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        //this.resultado = this.number1 - this.number2;
        double resta=0;
            for(int i=0;i<n;i++){
                numero = ingresarNumeros();

                resta-=numero;
            }
            Resultados(resta);
            return resta;
        }
        //JOptionPane.showMessageDialog((Component) null, "El resultado de la resta es: " + this.resultado);


    public double multiplicar(int n) {
        //this.number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        //this.number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        //this.resultado = this.number1 / this.number2;
        double multiplicacion=1;
        for(int i=0;i<n;i++){
            numero = ingresarNumeros();
            multiplicacion = multiplicacion * numero;
        }
        Resultados(multiplicacion);
        return multiplicacion;
        //JOptionPane.showMessageDialog((Component) null, "El resultado de la multiplicacion es: " + this.resultado);
    }

    public double division(int n) {
        //this.number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor"));
        //this.number2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo valor"));
        //this.resultado = this.number1 * this.number2;
        double division=1;
        numero = ingresarNumeros();
        division=numero/division;
        for(int i=1;i<n;i++){
            numero = ingresarNumeros();
            division=(double) (division/numero);
        }
        Resultados(division);
        return division;

        //JOptionPane.showMessageDialog((Component) null, "El resultado de la division es: " + this.resultado);
    }

    private static void Resultados(double resultado){
        JOptionPane.showMessageDialog(null,"El total es:"+resultado);
    }
}


