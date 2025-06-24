package practica5.interf;

/**
 * Interface {@code Coloreable} para colorear figuras.
 * @author Nombre
 * @version 1.0
 */
public interface Coloreable {

    /**
     * Color por omisi&oacute;n.
     */
    public static final String ANSI_RESET = "\u001B[0m";
    /**
     * Color rojo.
     */
    public static final String ANSI_RED = "\u001B[31m";
    /**
     * Color verde.
     */
    public static final String ANSI_GREEN = "\u001B[32m";
    /**
     * Color amarillo.
     */
    public static final String ANSI_YELLOW = "\u001B[33m";

    /**
     * Colorea una figura.
     * @param str {@code <String>} : figura en formato de cadena.
     * @return {@code <String>} : figura coloreada.
     */
    public String colorear(String str);
}