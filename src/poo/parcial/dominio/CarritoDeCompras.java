package poo.parcial.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarritoDeCompras {
    public static final byte CAPACIDAD = 20;
    private String supermercado;
    private List<Producto> productos;

    public CarritoDeCompras(String supermercado) {
        this.supermercado = supermercado;
        this.productos = new ArrayList<>();
    }

    public Producto buscar(String nombre) {
        Producto productoBuscado = null;

        // Tradicional
//        for (Producto p: this.productos) {
//            if (p.getNombre().equalsIgnoreCase(nombre)) {
//                productoBuscado = p;
//                break;
//            }
//        }

        // Funcional
        productoBuscado = this.productos.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                .findFirst().get();

        return productoBuscado;
    }

    public List<Producto> buscarPorTipo(String tipo) {
        List<Producto> productosBuscados = new ArrayList<>();

        // Verifico sí el tipo existe
        if (TipoProducto.TIPOS.stream().filter(t -> t.equals(tipo)).findFirst().isPresent()) {
            // Funcional
            productosBuscados = this.productos.stream()
                    .filter(prod -> prod.getTipo().equals(tipo))
                    .collect(Collectors.toList());

            return productosBuscados;
        } else {
            System.out.println("El tipo de producto no existe");
            return null;
        }
    }

    public boolean agregar(Producto producto) {
        if (this.productos.size() < CAPACIDAD) {
            this.productos.add(producto);
            return true;
        }

        return false;
    }

    public boolean sacar(String nombre) {
        Producto productoASacar = buscar(nombre);

        if (productoASacar != null) {
            this.productos.remove(productoASacar);
            return true;
        }
        return false;
    }

    public int calcularValorTotal() {
        int valorTotal = 0;

        // Tradicional
//        for (Producto prod : this.productos) {
//            valorTotal += prod.getPrecio();
//        }

        // Funcional
        valorTotal = this.productos.stream()
                .mapToInt(Producto::getPrecio)
                .sum();

        return valorTotal;
    }

    public Producto getProductoMasCaro() {
        Producto productoMasCaro = null;

        // Tradicional
//        for (Producto p: this.productos) {
//            if (p.getPrecio() > productoMasCaro.getPrecio()) {
//                productoMasCaro = p;
//            }
//        }

        // Funcional
        Collections.sort(this.productos, Comparator.comparingInt(Producto::getPrecio).reversed());
        return this.productos.get(0);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
