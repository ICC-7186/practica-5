package practica5.fig;

import practica5.interf.Calculable;
import practica5.interf.Coloreable;

/**
 * Clase {@code Cuadrado} que extiende a {@code PoligonoRegular}.
 * @author Nombre
 * @version 1.0
 * @see PoligonoRegular
 */
public class Cuadrado<N extends Number> extends PoligonoRegular<N> {

    /**
     * Crea un ejemplar de {@code Cuadrado}.
     * @param longitud {@code <N>} : longitud de los lados del cuadrado.
     */
    public Cuadrado(N longitud) {
        // completar
    }

    /**
     * Calcula el &aacute;rea de un cuadrado.
     * @return {@code <double>} : &aacute;rea de un cudrado.
     */
    public Double calcularArea() {
        return Double.valueOf(area());
    }

    /**
     * Calcula el &aacute;rea de un tri&aacute;ngulo usando una lambda.
     * @return {@code <>}
     */
    private double area() {
        // completar
    }

    /**
     * Colorea un cuadrado de color verde.
     * @param str {@code <String>} : cuadrado en formato de cadena. 
     * @return {@code <String>} : cuadrado coloreado de verde.
     */
    @Override
    public String colorear(String str) {
        // completar
    }

    /**
     * Devuelve un cuadrado en formato de cadena.
     * @return {@code <String>} : cuadrado en formato de cadena.
     */
    @Override
    public String toString() {
        // completar
    }
    
}