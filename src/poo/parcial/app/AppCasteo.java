package poo.parcial.app;

import poo.banco.dominio.Persona;

import java.time.LocalDateTime;

public class AppCasteo {
    public static void main(String[] args) {
        String nombre = "Alejo";
        LocalDateTime dia = LocalDateTime.now();
        Object objeto = new Persona("Alejandro");

        Persona pers = (Persona) objeto;

        System.out.println(pers);
    }
}
