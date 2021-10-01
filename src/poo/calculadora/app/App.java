package poo.calculadora.app;



import poo.calculadora.dominio.Calculadora;
import poo.parcial.dominio.Producto;
import poo.parcial.dominio.TipoProducto;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;
import java.net.MalformedURLException;
import java.net.URL;


public class App {
    private static ImageIcon icono = new ImageIcon("C:/Users/JUAN JOSE DIAZ E/Pictures/Calculadora.png");
    private static final int OPCION_SUMAR = 0;
    private static final int OPCION_RESTAR = 1;
    private static final int OPCION_MULTIPLICAR = 2;
    private static final int OPCION_DIVIDIR  = 3;



    public static void main(String[] args) {
        int n;
        Calculadora operacion = new Calculadora();
        JCheckBox checkBox = new JCheckBox();
        int opcionElegida = JOptionPane.showOptionDialog(null,"Que operación quiere realizar",
        "Calculadora",0,JOptionPane.PLAIN_MESSAGE,icono,new Object[]{"Sumar", "Restar", "Multiplicar", "Dividir"}, null);


        switch (opcionElegida) {
            case OPCION_SUMAR:
                n = operacion.ingresarN();
                operacion.sumar(n);
                break;

            case OPCION_RESTAR:
                n = operacion.ingresarN();
                operacion.restar(n);
                break;
            case OPCION_MULTIPLICAR:
                n = operacion.ingresarN();
                operacion.multiplicar(n);
                break;

            case OPCION_DIVIDIR:
                n = operacion.ingresarN();
                operacion.division(n);
                break;

            case JOptionPane.CLOSED_OPTION:
                return;
        }
    }
    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE, icono);
    }

}







