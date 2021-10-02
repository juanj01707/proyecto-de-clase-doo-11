package poo.calculadora.dominio;

import javax.swing.JOptionPane;
import java.util.List;


public class Calculadora {
    private double numero;
    private int n;
    private double resultado = 0.0;


    public Calculadora() {

    }

    public double sumar(List<Double> numeros, boolean redondear) {
        double resultado = 0;
        for (double num : numeros) {
            resultado += num;
        }
        if (redondear == true) {
            return Math.round(resultado);
        } else {

            return resultado;
        }
    }

    public double restar(List<Double> numeros,boolean redondear) {
        double cont = 0;
        double resultado = 0;
        for (double num : numeros) {
            if (cont == 0) {
                resultado = num;
                cont++;
            } else {
                resultado = resultado - num;
                cont++;
            }
        }
        if (redondear == true) {
            return Math.round(resultado);
        } else {

            return resultado;
        }
    }
    public double multiplicar(List<Double> numeros, boolean redondear) {
        double resultado = 1;
        for (double num : numeros) {
            resultado *= num;
        }
        if (redondear == true) {
            return Math.round(resultado);
        } else {

            return resultado;
        }
    }

    public double dividir(List<Double> numeros, boolean redondear) {
        double cont = 1;
        double resultado = 0;
        for (double num : numeros) {
            if (cont == 1) {
                resultado = num;
                cont++;
            } else {
                resultado = resultado / num;
                cont++;
            }
        }
        if (redondear == true) {
            return Math.round(resultado);
        } else {

            return resultado;
        }
    }
}

