package practica5.fig;

/**
 * Prueba el constructor de {@link PoligonoRegular}.
 * @author Nombre
 * @version 1.0
 */
public class PR<N extends Number> extends PoligonoRegular<N> {

    /**
     * Crea un pol&iacute;gono regular cualquiera.
     * @param lados {@code <int>} : lados del pol&iacute;gono regular.
     * @param longitud {@code <N>} : longitud de los lados del pol&iacute;gono regular.
     */
    public PR(int lados, N longitud) {
        super(lados, longitud);
    }

    /**
     * No hace nada.
     * @return {@code <Double>} : nada.
     */
    @Override
    public Double calcularArea() {
        return 1.0;
    }

    /**
     * No hace nada.
     * @return {@code <String>} : nada.
     */
    @Override
    public String colorear(String str) {
        return "";
    }
    
}
