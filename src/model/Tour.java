package model;

/**
 * Clase que representa un tour ofrecido por la agencia Llanquihue Tour.
 * Contiene los datos principales del tour: nombre, tipo, precio y cupos disponibles.
 *
 * @author Aurora Conforti
 * @version 1.0
 */
public class Tour {

    // ─────────────────────────────────────────────
    // Atributos privados (encapsulamiento)
    // ─────────────────────────────────────────────

    /** Nombre descriptivo del tour. */
    private String nombre;

    /** Tipo de tour: gastronomico, lacustre, cultural, aventura, etc. */
    private String tipo;

    /** Precio del tour en pesos chilenos. */
    private int precio;

    /** Cantidad de cupos disponibles para el tour. */
    private int cuposDisponibles;

    // ─────────────────────────────────────────────
    // Constructor sin parametros
    // ─────────────────────────────────────────────

    /**
     * Constructor por defecto con valores predeterminados.
     */
    public Tour() {
        this.nombre            = "Sin nombre";
        this.tipo              = "Sin tipo";
        this.precio            = 0;
        this.cuposDisponibles  = 0;
    }

    // ─────────────────────────────────────────────
    // Constructor con parametros
    // ─────────────────────────────────────────────

    /**
     * Constructor con parametros para inicializar todos los atributos del tour.
     *
     * @param nombre           Nombre del tour.
     * @param tipo             Tipo de tour.
     * @param precio           Precio en pesos chilenos.
     * @param cuposDisponibles Cupos disponibles.
     */
    public Tour(String nombre, String tipo, int precio, int cuposDisponibles) {
        this.nombre            = nombre;
        this.tipo              = tipo;
        this.precio            = precio;
        this.cuposDisponibles  = cuposDisponibles;
    }

    // ─────────────────────────────────────────────
    // Getters
    // ─────────────────────────────────────────────

    /**
     * Retorna el nombre del tour.
     * @return nombre del tour.
     */
    public String getNombre() { return nombre; }

    /**
     * Retorna el tipo del tour.
     * @return tipo del tour.
     */
    public String getTipo() { return tipo; }

    /**
     * Retorna el precio del tour.
     * @return precio en pesos chilenos.
     */
    public int getPrecio() { return precio; }

    /**
     * Retorna los cupos disponibles del tour.
     * @return cupos disponibles.
     */
    public int getCuposDisponibles() { return cuposDisponibles; }

    // ─────────────────────────────────────────────
    // Setters
    // ─────────────────────────────────────────────

    /**
     * Establece el nombre del tour.
     * @param nombre Nombre a asignar.
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Establece el tipo del tour.
     * @param tipo Tipo a asignar.
     */
    public void setTipo(String tipo) { this.tipo = tipo; }

    /**
     * Establece el precio del tour.
     * @param precio Precio a asignar.
     */
    public void setPrecio(int precio) { this.precio = precio; }

    /**
     * Establece los cupos disponibles del tour.
     * @param cuposDisponibles Cupos a asignar.
     */
    public void setCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    // ─────────────────────────────────────────────
    // toString
    // ─────────────────────────────────────────────

    /**
     * Retorna una representacion legible del tour.
     * @return String con los datos del tour.
     */
    @Override
    public String toString() {
        return "  Nombre  : " + nombre +
               "\n  Tipo    : " + tipo +
               "\n  Precio  : $" + String.format("%,d", precio) +
               "\n  Cupos   : " + cuposDisponibles;
    }
}
