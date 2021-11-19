package poo.biblioteca.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Biblioteca {
    private  List<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }

    public void addRecurso(Recurso... r) {
        this.recursos.addAll(Arrays.asList(r));
    }

    public boolean prestarRecurso(Recurso r) {
        if (r instanceof Prestable && !r.isPrestado()) {
            ((Prestable) r).prestar();
            System.out.println(r.getNombre() + " El producto a sido prestado exitosamente");
            return true;
        } else {
            System.out.println(r.getNombre() + "el producto no se puede prestar");
            return false;
        }
    }

    public boolean devolverRecurso(Recurso r) {
        if (r instanceof Prestable && r.isPrestado()) {
            ((Prestable) r).devolver();
            System.out.println(r.getNombre() + " devuelto exitosamente");
            return false;
        } else {
            System.out.println(r.getNombre() + " no se puede devolver");
            return true;
        }
    }
    public Boolean fotocopiarRecursos(Recurso r){
        if (r instanceof Copiable && !r.isPrestado()) {
            ((Copiable) r).fotocopiar();
            System.out.println(r.getCopias() + " El producto a sido Fotocopiado  exitosamente");
            return true;
        } else {
            System.out.println(r.getCopias() + "el producto no se puede fotocopiar");
            return false;
        }
    }

    public void listarPrestados() {
        this.recursos.forEach(recurso -> {
            if (recurso instanceof Prestable && recurso.isPrestado()) {
                System.out.println(recurso + " Prestados");
            }
        });
    }

    //public void listarCopiasPorRecurso(){
       // this.recursos.forEach(recurso -> {
            //if (recurso instanceof Copiable && recurso.getCopias()) {
         //       System.out.println(recurso + " Recursos Fotocopiados");
           // }
       // });

    }


