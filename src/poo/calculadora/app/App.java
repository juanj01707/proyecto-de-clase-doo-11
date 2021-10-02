package poo.calculadora.app;



import poo.calculadora.dominio.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.net.MalformedURLException;
import java.net.URL;


public class App {
    private static ImageIcon icono = new ImageIcon("C:\\Users\\JUAN JOSE DIAZ E\\Desktop\\Alejo\\poo-2021-02\\src\\poo\\calculadora\\app\\Calculadora.png");
    private static final int OPCION_SUMAR = 0;
    private static final int OPCION_RESTAR = 1;
    private static final int OPCION_MULTIPLICAR = 2;
    private static final int OPCION_DIVIDIR  = 3;
    private static final int OPCION_CHECKBOX = 4;
    private static int n;

    public static void main(String[] args) {
        int n;
        Calculadora operacion = new Calculadora();
        JCheckBox checkBox = new JCheckBox("redondear");
        List<Double> numeros;
        numeros = new ArrayList<>();
        while (true) {

            int opcionElegida= JOptionPane.showOptionDialog(null, "que operacion quieres realizar",
                    "Calculadora", 0, JOptionPane.PLAIN_MESSAGE,icono,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir",checkBox).toArray(), null);

            switch (opcionElegida) {
                case OPCION_SUMAR :

                    n = ingresarN();
                    for (int i = 0; i< n; i++){
                        double numero = 0;
                        do{
                            try{
                                numero = ingresarNumeros();
                                numeros.add(numero);
                            }catch (NumberFormatException error){
                                mostrarMensaje("El numero no es valido");
                            }
                            System.out.println(numeros);
                        }while(numero<0);
                    }
                    double resultadoSuma = operacion.sumar(numeros, checkBox.isSelected());
                    mostrarMensaje("El resultado de la suma es: " + resultadoSuma);
                    numeros.clear();
                    break;

                case OPCION_RESTAR :
                    n = ingresarN();
                    for(int i = 0; i< n; i++){
                        double numero = 0;
                        do{ try{
                                numero = ingresarNumeros();
                                numeros.add(numero);
                            }catch (NumberFormatException error){
                                mostrarMensaje("El numero no es valido");
                            }
                            System.out.println(numeros);
                        }while(numero<0);
                    }
                    double resultadoResta = operacion.restar(numeros,checkBox.isSelected());
                    mostrarMensaje("El resultado de la resta es: " + resultadoResta);
                    numeros.clear();

                    break;

                case OPCION_MULTIPLICAR :
                    n = ingresarN();
                    for(int i = 0; i< n; i++){
                        double numero = 0;
                        do{ try{
                            numero = ingresarNumeros();
                            numeros.add(numero);
                        }catch (NumberFormatException error){
                            mostrarMensaje("El numero no es valido");
                        }
                            System.out.println(numeros);

                        }while(numero<0);
                    }
                    double resultadoMultiplicacion = operacion.multiplicar(numeros, checkBox.isSelected());
                    mostrarMensaje("El resultado de la multiplicación es: "+resultadoMultiplicacion);
                    numeros.clear();
                    break;

                case OPCION_DIVIDIR :
                    n = ingresarN();
                    for(int i = 0; i< n; i++){
                        double numero = 0;
                        do{ try{
                            numero = ingresarNumeros();
                            numeros.add(numero);
                        }catch (NumberFormatException error){
                            mostrarMensaje("El numero no es valido");
                        }
                            System.out.println(numeros);

                        }while(numero<0);
                    }
                    double resultadoDivision = operacion.dividir(numeros, checkBox.isSelected());
                    mostrarMensaje("El resultado de la división es: "+resultadoDivision);
                    numeros.clear();
                    break;

                case OPCION_CHECKBOX :
                    boolean check = checkBox.isSelected();

                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }
    }
    public static int ingresarN(){
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

    public static double ingresarNumeros(){
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
    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE, icono);
    }

}







