package practica5.fig;

import practica5.interf.Calculable;
import practica5.interf.Coloreable;

/**
 * Clase {@code Pentagono} que extiende a {@code PoligonoRegular}.
 * @author Nombre
 * @version 1.0
 * @see PoligonoRegular
 */
public class Pentagono<N extends Number> extends PoligonoRegular<N> {

    /**
     * Crea un ejemplar de {@code Pentagono}.}
     * @param longitud {@code <N>} : longitud de los lados de un pent&aacute;gono.
     */
    public Pentagono(N longitud) {
        // completar
    }

    /**
     * Calcula el &aacute;rea de un tri&aacute;ngulo.
     * @return {@code <double>} : &aacute;rea de un tri&aacute;ngulo.
     */
    public Double calcularArea() {
        return Double.valueOf(area());
    }

    /**
     * Calcula el &aacute;rea de un pent&aacute;gono usando una lambda.
     * @return {@code <double>} : &aacute;rea de un pent&aacute;gono. 
     */
    private double area() {
        // completar
    }

    /**
     * Colorea un pent&aacute;gono de color amarillo.
     * @param str {@code <String>} : pent&aacute;gono en formato de cadena. 
     * @return {@code <String>} : pent&aacute;gono coloreado de amarillo.
     */
    @Override
    public String colorear(String str) {
       // completar
    }

    /**
     * Devuelve un pent&aacute;gono en formato de cadena.
     * @return {@code <String>} : pent&aacute;gono en formato de cadena.
     */
    @Override
    public String toString() {
        // completar
    }
    
}