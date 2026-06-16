package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * Clase principal del sistema de gestion de tours de Llanquihue Tour.
 * Carga los datos desde el archivo tours.txt, muestra todos los tours,
 * realiza busqueda por tipo y filtra por precio y cupos disponibles.
 *
 * @author Aurora Conforti
 * @version 1.0
 */
public class Main {

    /**
     * Metodo principal que ejecuta el programa.
     * @param args Argumentos de la linea de comandos (no se utilizan).
     */
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   LLANQUIHUE TOUR - Catalogo de Tours");
        System.out.println("   Agencia de Turismo - Region de Los Lagos");
        System.out.println("==========================================");
        System.out.println();

        // ─────────────────────────────────────────
        // Paso 1: Cargar datos desde el archivo TXT
        // ─────────────────────────────────────────
        GestorDatos gestor = new GestorDatos("resources/tours.txt");
        ArrayList<Tour> listaTours = gestor.cargarTours();

        System.out.println("Total de tours cargados: " + listaTours.size());
        System.out.println();

        // ─────────────────────────────────────────
        // Paso 2: Recorrer y mostrar todos los tours
        // ─────────────────────────────────────────
        System.out.println("==========================================");
        System.out.println("   TODOS LOS TOURS DISPONIBLES");
        System.out.println("==========================================");

        for (int i = 0; i < listaTours.size(); i++) {
            System.out.println("Tour #" + (i + 1));
            System.out.println(listaTours.get(i).toString());
            System.out.println("------------------------------------------");
        }

        // ─────────────────────────────────────────
        // Paso 3: Filtrar tours GASTRONOMICOS
        // ─────────────────────────────────────────
        System.out.println();
        System.out.println("==========================================");
        System.out.println("   FILTRO: TOURS GASTRONOMICOS");
        System.out.println("==========================================");

        // Lista para almacenar los tours filtrados
        ArrayList<Tour> toursGastronomicos = new ArrayList<>();

        for (Tour tour : listaTours) {
            if (tour.getTipo().equalsIgnoreCase("gastronomico")) {
                toursGastronomicos.add(tour);
            }
        }

        if (toursGastronomicos.isEmpty()) {
            System.out.println("  No se encontraron tours gastronomicos.");
        } else {
            for (Tour tour : toursGastronomicos) {
                System.out.println(tour.toString());
                System.out.println("------------------------------------------");
            }
            System.out.println("Total gastronomicos: " + toursGastronomicos.size());
        }

        // ─────────────────────────────────────────
        // Paso 4: Filtrar tours con precio menor a $40.000
        // ─────────────────────────────────────────
        System.out.println();
        System.out.println("==========================================");
        System.out.println("   FILTRO: TOURS CON PRECIO MENOR A $40.000");
        System.out.println("==========================================");

        ArrayList<Tour> toursEconomicos = new ArrayList<>();

        for (Tour tour : listaTours) {
            if (tour.getPrecio() < 40000) {
                toursEconomicos.add(tour);
            }
        }

        if (toursEconomicos.isEmpty()) {
            System.out.println("  No se encontraron tours en ese rango de precio.");
        } else {
            for (Tour tour : toursEconomicos) {
                System.out.println(tour.toString());
                System.out.println("------------------------------------------");
            }
            System.out.println("Total economicos: " + toursEconomicos.size());
        }

        // ─────────────────────────────────────────
        // Paso 5: Filtrar tours con cupos disponibles mayores a 5
        // ─────────────────────────────────────────
        System.out.println();
        System.out.println("==========================================");
        System.out.println("   FILTRO: TOURS CON MAS DE 5 CUPOS");
        System.out.println("==========================================");

        ArrayList<Tour> toursConCupos = new ArrayList<>();

        for (Tour tour : listaTours) {
            if (tour.getCuposDisponibles() > 5) {
                toursConCupos.add(tour);
            }
        }

        if (toursConCupos.isEmpty()) {
            System.out.println("  No se encontraron tours con cupos disponibles.");
        } else {
            for (Tour tour : toursConCupos) {
                System.out.println(tour.toString());
                System.out.println("------------------------------------------");
            }
            System.out.println("Total con cupos > 5: " + toursConCupos.size());
        }

        System.out.println();
        System.out.println("==========================================");
        System.out.println("   Fin del catalogo - Llanquihue Tour");
        System.out.println("==========================================");
    }
}
