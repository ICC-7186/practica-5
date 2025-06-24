package practica5.interf;

/**
 * Interface funcional {@code Calculable} para determinar el &aacute;rea de una figura.
 * @author Nombre
 * @version 1.0
 */
@FunctionalInterface
public interface Calculable {

    /**
     * Calcula el &aacute;rea de una figura.
     * @return {@code <Double>} : &aacute;rea de una figura.
     */
    public double area();
    
}
