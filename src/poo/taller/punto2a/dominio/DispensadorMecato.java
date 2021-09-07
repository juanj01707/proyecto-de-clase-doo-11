package poo.taller.punto2a.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DispensadorMecato {
    public static final int CANTIDAD_MAXIMA_DE_PRODUCTOS = 10;
    private String marca;
    private List<Mecato> productos;

    public DispensadorMecato(String marca) {
        this.marca = marca;
        this.productos = new ArrayList<>(); // Siempre
    }

    public Mecato buscar(int codigo) {
        Mecato mecatoBuscado = null;

        for (Mecato mecato: this.productos) {
            if (mecato.getCodigo() == codigo) {
                mecatoBuscado = mecato;
                break;
            }
        }

        return mecatoBuscado;
    }

    public Mecato buscar(String nombre) {
        Mecato mecatoBuscado = null;

        for (Mecato mecato: this.productos) {
            if (mecato.getNombre().equalsIgnoreCase(nombre)) {
                mecatoBuscado = mecato;
                break;
            }
        }

        return mecatoBuscado;
    }

    public boolean agregar(Mecato mecato) {
        if (this.productos.size() < CANTIDAD_MAXIMA_DE_PRODUCTOS) {
            Mecato m = buscar(mecato.getCodigo());
            if (m == null) {
                this.productos.add(mecato);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean sacar(Mecato mecato) {
        if (mecato != null) {
            mecato.setCantidadActual(mecato.getCantidadActual() - 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean sacarUnidad(int codigo) {
        Mecato mecatoBuscado = buscar(codigo);
        return sacar(mecatoBuscado);
    }

    public boolean sacarUnidad(String nombre) {
        Mecato mecatoBuscado = buscar(nombre);
        return sacar(mecatoBuscado);
    }

    public List<String> consultarAgotados() {
        List<String> agotados = new ArrayList<>();

        // Tradicional
//        for (Mecato mecato: this.productos) {
//            if (mecato.getCantidadActual() == 0) {
//                agotados.add(mecato.getNombre());
//            }
//        }

        // Funcional
        agotados = this.productos.stream()
                    .filter(m -> m.getCantidadActual() == 0)
                    .map(m -> m.getNombre())
                    .collect(Collectors.toList());

        return agotados;
    }

    public int consultarUnidades(int codigo) {
        Mecato mecatoBuscado = buscar(codigo);
        return consultarUnidades(mecatoBuscado);
    }

    public int consultarUnidades(String nombre) {
        Mecato mecatoBuscado = buscar(nombre);
        return consultarUnidades(mecatoBuscado);
    }

    private int consultarUnidades(Mecato mecato) {
        if (mecato != null) {
            return mecato.getCantidadActual();
        }

        return 0;
    }

    public int consultarUnidadesTotales() {
        int totalUnidades = 0;
        // Tradicional
//        for (Mecato m: this.productos) {
//            totalUnidades += m.getCantidadActual();
//        }

        // Funcional
        totalUnidades = this.productos.stream()
                            .mapToInt(m -> m.getCantidadActual())
                            .sum();

        return totalUnidades;
    }

    public void aumentarStock(int codigo, int cantidadAAumentar) {
        Mecato mecato = buscar(codigo);

        if (mecato != null) {
            if ((mecato.getCantidadActual() + cantidadAAumentar) < Mecato.CANTIDAD_MAXIMA_DE_UNIDADES) {
                mecato.setCantidadActual(mecato.getCantidadActual() + cantidadAAumentar);
            } else {
                mecato.setCantidadActual(Mecato.CANTIDAD_MAXIMA_DE_UNIDADES);
            }
        }
    }
}
