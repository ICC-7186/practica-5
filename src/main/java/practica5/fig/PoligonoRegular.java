package practica5.fig;

import practica5.interf.Coloreable;

/**
 * Clase abstracta {@code PoligonoRegular} para contruir pol&iacute;gonos regulates
 * y calcular sus componentes.
 * @author Nombre
 * @version 1.0 
 */
public abstract class PoligonoRegular <N extends Number> implements Coloreable {

    protected int lados;
    protected N longitud;

    /**
     * Constructor para crear un pol&iacute;gono regular.
     * @param lados {@code <int>} : cantidad de lados del po&iacute;gono regular.
     * @param longitud {@code <N>} : tipo num&eacute;rico que representa la longitud.
     */
    public PoligonoRegular(int lados, N longitud) {
        // completar
    }

    /**
     * Devuelve el n&uacute;mero de lados del pol&iacute;gono regular.
     * @return {@code <int>} : n&uacute;mero de lados del pol&iacute;gono regular.
     */
    public int obtenerLados() {
        // completar
    }
    
    /**
     * Devuelve la longitud de los lados del pol&iacute;gono regular.
     * @return {@code <int>} : longitud de los lados del pol&iacute;gono regular.
     */
    public N obtenerLongitud() {
        // completar
    }

    /**
     * Convierte a una instancia de una subclase de Number.
     * @param valor {@code <N>} : valor a asignar.
     * @return {@code <N>} : valor asignado.
     */
    @SuppressWarnings("unchecked")
    private N convertirA(N valor) {
        // completar
    }

    /**
     * Calcula el per&iacute;metro de un pol&iacute;gono regular.
     * @return {@code <N>} : per&iacute;metro del pol&iacute;gono regular.
     */
    @SuppressWarnings("unchecked")
    public N calcularPerimetro() {
        // completar
    }

    /**
     * Calcula el &aacute;rea de un pol&iacute;gono regular.
     * @return {@code <double>} : &aacute;rea de un pol&iacute;gono regular.
     */
    public abstract Double calcularArea();

    /**
     * Colorea un pol&iacute;gono regular de un color.
     * @param str {@code <String>} : pol&iacute;gono regular en formato de cadena. 
     * @return {@code <String>} : pol&iacute;gono regular coloreado de rojo.
     */
    @Override
    public abstract String colorear(String str);

    /**
     * Verifica si dos pol&iacute;gonos regulares son iguales.
     * @param o {@code Object} : pol&iacute;gono regular a comparar.
     * @return {@code <boolean>} : {@code true} si son iguales, {@code false} en otro caso.
     */
    @Override
    public boolean equals(Object o) {
        // completar
    }

    /**
     * Devuelve un pol&iacute;gono regular en formato de cadena.
     * @return {@code <String>} : pol&iacute;gono regular en formato de cadena.
     */
    @Override
    public String toString() {
        // completar
    }

}