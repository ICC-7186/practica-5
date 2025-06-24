package practica5.fig;

import practica5.interf.Calculable;
import practica5.interf.Coloreable;

/**
 * Clase {@code Triangulo} que extiende a {@code PoligonoRegular}.
 * @author Nombre
 * @version 1.0
 * @see PoligonoRegular
 */
public class Triangulo<N extends Number> extends PoligonoRegular<N> {

    /**
     * Crea un ejemplar de {@code Triangulo}. 
     * @param longitud {@code <N>} : longitud de los lados del tri&aacute;ngulo.
     */
    public Triangulo(N longitud) {
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
     * Calcula el &aacute;rea de un tri&aacute;ngulo usando una lambda.
     * @return {@code <>}
     */
    private double area() {
        // completar
    }

    /**
     * Colorea un tri&aacute;ngulo de color rojo.
     * @param str {@code <String>} : tri&aacute;ngulo en formato de cadena. 
     * @return {@code <String>} : tri&aacute;ngulo coloreado de rojo.
     */
    @Override
    public String colorear(String str) {
       // completar
    }

    /**
     * Devuelve un tri&aacute;gulo en formato de cadena.
     * @return {@code <String>} : tri&aacute;gulo en formato de cadena.
     */
    @Override
    public String toString() {
        // completar
    }
    
}