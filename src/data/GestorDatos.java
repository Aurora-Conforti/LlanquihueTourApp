package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase responsable de leer el archivo tours.txt y convertir
 * cada linea en un objeto Tour almacenado en un ArrayList.
 *
 * Formato esperado del archivo:
 * nombre;tipo;precio;cuposDisponibles
 *
 * @author Aurora Conforti
 * @version 1.0
 */
public class GestorDatos {

    /** Ruta del archivo de datos. */
    private String rutaArchivo;

    // ─────────────────────────────────────────────
    // Constructor
    // ─────────────────────────────────────────────

    /**
     * Constructor que recibe la ruta del archivo a leer.
     * @param rutaArchivo Ruta relativa o absoluta del archivo .txt
     */
    public GestorDatos(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    // ─────────────────────────────────────────────
    // Metodo principal: leer archivo y crear objetos
    // ─────────────────────────────────────────────

    /**
     * Lee el archivo .txt linea por linea, separa los datos con split(";"),
     * crea objetos Tour y los almacena en un ArrayList.
     *
     * @return ArrayList con todos los tours leidos desde el archivo.
     */
    public ArrayList<Tour> cargarTours() {

        // Lista donde se almacenaran los objetos Tour
        ArrayList<Tour> listaTours = new ArrayList<>();

        try {
            // Abrir el archivo para lectura
            FileReader     fr     = new FileReader(rutaArchivo);
            BufferedReader reader = new BufferedReader(fr);

            String linea;

            // Leer linea por linea hasta el final del archivo
            while ((linea = reader.readLine()) != null) {

                // Ignorar lineas vacias
                if (!linea.trim().isEmpty()) {

                    // Separar los datos usando el delimitador ";"
                    String[] partes = linea.split(";");

                    // Verificar que la linea tenga los 4 campos esperados
                    if (partes.length == 4) {

                        // Extraer cada campo
                        String nombre           = partes[0].trim();
                        String tipo             = partes[1].trim();
                        int    precio           = Integer.parseInt(partes[2].trim());
                        int    cuposDisponibles = Integer.parseInt(partes[3].trim());

                        // Crear el objeto Tour con los datos leidos
                        Tour tour = new Tour(nombre, tipo, precio, cuposDisponibles);

                        // Agregar el objeto a la lista
                        listaTours.add(tour);
                    }
                }
            }

            // Cerrar el archivo
            reader.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error de formato en los datos: " + e.getMessage());
        }

        return listaTours;
    }
}
