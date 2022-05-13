package poo.parcial.app;

import poo.parcial.dominio.CarritoDeCompras;
import poo.parcial.dominio.Producto;
import poo.parcial.dominio.TipoProducto;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppSuper {
    private static ImageIcon icono = new ImageIcon("C:/Users/Alejandro/Desktop/uco.png");
    private static final int OPCION_AGREGAR = 0;
    private static final int OPCION_SACAR = 1;
    private static final int OPCION_MAS_CARO = 2;
    private static final int OPCION_VER_TOTAL = 3;
    private static final int OPCION_VER_POR_TIPO = 4;

    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras("Exito");

        while (true) {
            int opcionElegida = JOptionPane.showOptionDialog(null, "Elige una de las siguientes opciones",
                    "POO", 0, 0, icono,
                    Arrays.asList("Agregar Producto", "Sacar producto", "Ver más caro", "Ver total", "Ver por tipo").toArray(), null);

            switch (opcionElegida) {
                case OPCION_AGREGAR :
                    String nombre;
                    do {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    } while (nombre == null || nombre.trim().isEmpty());

                    int precio = 0;
                    do {
                        try {
                            precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de " + nombre.trim()));
                        } catch (NumberFormatException e) {
                            mostrarMensaje("El precio ingresado no es correcto.");
                        }

                    } while(precio <= 0);

                    String tipo = (String) JOptionPane.showInputDialog(null, "Qué tipo de producto es " + nombre + "?",
                            "POO", JOptionPane.QUESTION_MESSAGE, icono, TipoProducto.TIPOS.toArray(), null);

                    Producto producto = new Producto(nombre, precio, tipo);
                    boolean agrego = carrito.agregar(producto);

                    if (agrego == true) {
                        mostrarMensaje("Producto agregado correctamente!");
                    } else {
                        mostrarMensaje("Ocurrió un error agregando el producto");
                    }
                    break;
<<<<<<< Updated upstream
                case OPCION_VER_POR_TIPO :
                    String tipoBuscado = (String) JOptionPane.showInputDialog(null, "Seleccione un tipo a buscar",
                            "POO", JOptionPane.QUESTION_MESSAGE, icono, TipoProducto.TIPOS.toArray(), null);

                    List<Producto> productosDelTipo = carrito.buscarPorTipo(tipoBuscado);

                    String productos = productosDelTipo.stream()
                            .map(producto1 -> producto1.getNombre())
                            .collect(Collectors.joining(", "));

                    mostrarMensaje(productos);

//                    for (Producto p: productosDelTipo) {
//                        mostrarMensaje(p.getNombre());
//                    }

                    break;
                case OPCION_SACAR :
                    String nombreASacar;
                    do {
                        nombreASacar = JOptionPane.showInputDialog("Ingrese el nombre");
                    } while (nombreASacar == null || nombreASacar.trim().isEmpty());

                    if (carrito.sacar(nombreASacar) == true) {
                        mostrarMensaje(nombreASacar + " se sacó del carrito.");
                    } else {
                        mostrarMensaje(nombreASacar + " no existe en el carrito.");
                    }

                    break;
                case OPCION_MAS_CARO :
                    Producto pCaro = carrito.getProductoMasCaro();

                    mostrarMensaje(pCaro.getNombre()  + "\n $ " + pCaro.getPrecio());
=======

                case OPCION_SACAR :
                    //carrito = JOptionPane.showInputDialog(null,"que producto deceas sacar");
                    //carrito.sacar("nombre");
                    mostrarMensaje("Cual es el producto a sacar" + carrito.getProductos().size()  +
                            " productos. Has sacado el producto " + carrito.sacar() + " del carrito " );
                    break;
                case OPCION_MAS_CARO :
                    carrito.getProductoMasCaro();
                    mostrarMensaje("Aqui va mas caro");
>>>>>>> Stashed changes
                    break;
                case OPCION_VER_TOTAL :
                    mostrarMensaje("Llevas " + carrito.getProductos().size()  +
                            " productos. El valor total de tu mercado es " + carrito.calcularValorTotal());
                    break;
                case OPCION_VER_POR_TIPO :
                    //carrito.buscarPorTipo(String tipo);
                    //mostrarMensaje("De que tipo es el producto"+ carrito.getProductos().size() + carrito.buscarPorTipo(String tipo));
                    break;
                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }

//        int opcion = JOptionPane.showConfirmDialog(null, "Quieres seguir?", "Elige...",
//                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icono);
//
//        switch (opcion) {
//            case JOptionPane.YES_OPTION :
//                mostrarMensaje("Eligió SI");
//                break;
//            case JOptionPane.NO_OPTION :
//                mostrarMensaje("Eligió NO");
//                break;
//            case JOptionPane.CANCEL_OPTION :
//                mostrarMensaje("Eligió CANCELAR");
//                break;
//            default :
//                mostrarMensaje("CERRÓ LA VENTANA");
//        }

//        if (opcion == JOptionPane.OK_OPTION) {
//            mostrarMensaje("Eligió que si!");
//        } else if (opcion == JOptionPane.NO_OPTION) {
//            mostrarMensaje("Eligió NOOOOO!");
//        } else if (opcion == JOptionPane.CANCEL_OPTION) {
//            mostrarMensaje("CANCELÓ!");
//        } else {
//            mostrarMensaje("CERRÓ LA VENTANA");
//        }
    }

    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE, icono);
    }
}
