package poo.interfaces2.dominio;

import poo.interfaces2.dominio.Viruseable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Antivirus {
    private String nombre;
    private List<Viruseable> archivos;

    public Antivirus(String nombre) {
        this.nombre = nombre;
        this.archivos = new ArrayList<>();
    }

    public void agregar(Viruseable... v) {
        this.archivos.addAll(Arrays.asList(v));
    }

    public void escanear() {
        AtomicInteger cantidadVirus = new AtomicInteger();

        archivos.forEach(v -> {
            if (v.tieneVirus()) {
                cantidadVirus.incrementAndGet();
                System.out.println("Se detectó una amenaza en " + v.getNombre());
            }
        });

        System.out.println("Se examinaron " + archivos.size() + " archivos, y se encontraron " + cantidadVirus.get() + " virus.");
    }

    public String getNombre() {
        return nombre;
    }
}
