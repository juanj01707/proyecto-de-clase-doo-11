package poo.taller.punto2a.app;

import poo.taller.punto2a.dominio.DispensadorMecato;
import poo.taller.punto2a.dominio.Mecato;

public class AppMecato {
    public static void main(String[] args) {
        DispensadorMecato dispensadorMecato = new DispensadorMecato("Tienda");

        Mecato hit = new Mecato(1, "Jugo Hit", 2000, 1);
        Mecato trululu = new Mecato(2, "Trululu", 1500);
        Mecato choclitos = new Mecato(3, "Choclitos", 1200, 5);
        Mecato cocaCola = new Mecato(4, "Coca Cola", 2300, 7);

        dispensadorMecato.agregar(hit);
        dispensadorMecato.agregar(trululu);
        dispensadorMecato.agregar(choclitos);
        dispensadorMecato.agregar(cocaCola);

        dispensadorMecato.sacarUnidad("jugo hit");

        System.out.println("\n AGOTADOS");
        System.out.println(dispensadorMecato.consultarAgotados());

        System.out.println("\n TOTALES");
        System.out.println(dispensadorMecato.consultarUnidadesTotales());
    }
}
