package poo.parcial.app;

import poo.parcial.dominio.CarritoDeCompras;
import poo.parcial.dominio.Producto;
import poo.parcial.dominio.TipoProducto;

public class AppSuper {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras("Exito");

        Producto escoba = new Producto("Escoba", 7300, TipoProducto.ASEO);
        Producto pan = new Producto("Pan de 200", 200, TipoProducto.PAN);
        Producto salchichas = new Producto("Salchichas", 7200, TipoProducto.CARNE);
        Producto deTodito = new Producto("De Todito", 2000, TipoProducto.CEREAL);

        carrito.agregar(escoba);
        carrito.agregar(pan);
        carrito.agregar(salchichas);
        carrito.agregar(deTodito);
        carrito.agregar(pan);

        Producto p = carrito.getProductoMasCaro();

       System.out.println(p.getNombre() + " - " + p.getPrecio());
    }
}
