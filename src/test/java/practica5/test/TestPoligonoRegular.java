package practica5.test;

import practica5.fig.*;

import java.util.Random;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Rule;
import org.junit.rules.Timeout;


/**
 * Clase para probar si {@link PoligonoRegular} funciona correctamente.
 * @author Rams&eacute;s Antonio L&oacute;pez Soto.
 * @version 1.0
 */
public class TestPoligonoRegular {
    
    /** Expiración para que ninguna prueba tarde más de 5 segundos. */
    @Rule 
    public Timeout expiracion = Timeout.seconds(5);
    
    private static Random rnd = new Random();
    private PoligonoRegular<Integer> p1;
    private PoligonoRegular<Byte> p2;
    private PoligonoRegular<Double> p3;

    @Test 
    public void ConstructorPoligono () {
        int n = rnd.nextInt(48) + 3;
        double d = rnd.nextDouble(); 
        PoligonoRegular<Integer> e = new PR<>(n, n);
        PoligonoRegular<Double> t = new PR<>(n - n, d); 
        assertNotNull(e);
        assertNotNull(t);
        assertEquals(n, e.obtenerLados());
        assertEquals(n, e.obtenerLongitud().intValue());
        assertEquals(3, t.obtenerLados());
        assertEquals(1, t.obtenerLongitud().doubleValue(),1);
    }

    @Test
    public void testCalcularArea() {
        int n = rnd.nextInt(48) + 3;
        p1 = new Triangulo<Integer>(n);
        p2 = new Cuadrado<Byte>((byte)n);
        p3 = new Pentagono<Double>((double)n);
        assertNotNull(p1);
        assertNotNull(p2);
        assertNotNull(p3);
        double s = (n * 3) / 2;
        double a1 = (Math.sqrt(3)/4) * Math.pow(n, 2);
        double a2 = n * n;
        double a3 = 1.72 * Math.pow(n, 2);
        assertEquals(Double.valueOf(redondear(a1)), p1.calcularArea());
        assertEquals(Double.valueOf(redondear(a2)), p2.calcularArea());
        assertEquals(Double.valueOf(redondear(a3)), p3.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        int n = rnd.nextInt(48) + 3;
        p1 = new Triangulo<Integer>(n);
        p2 = new Cuadrado<Byte>((byte)n);
        p3 = new Pentagono<Double>((double)n);
        assertNotNull(p1);
        assertNotNull(p2);
        assertNotNull(p3);
        Integer pr1 = Integer.valueOf(n * 3);
        Byte pr2 = Byte.valueOf((byte)(n * 4));
        Double pr3 = Double.valueOf(n * 5);
        assertEquals(pr1, p1.calcularPerimetro());
        assertEquals(pr2, p2.calcularPerimetro());
        assertEquals(pr3, p3.calcularPerimetro());
    }

    @Test
    public void testEquals() {
        int n = rnd.nextInt(48) + 3;
        p1 = new Triangulo<Integer>(n);
        PoligonoRegular<Double> t1 = new Triangulo<Double>((double)n);
        PoligonoRegular<Integer> t2 = new Triangulo<Integer>(n);
        assertNotNull(p1);
        assertNotNull(t1);
        assertNotNull(t2);
        assertEquals(true, p1.equals(t2));
        assertEquals(false, p1.equals(t1));
        assertFalse(t1.equals(t2));
    }

    /**
     * Redondea un n&uacute;mero real a dos cifras significativas.
     * @param n {@code <double>} : n&uacute;mero real a redondear.
     * @return {@code <double>} : n&uacute;mero real {@code n} redondeado.
     */
    private double redondear(double n) {
        return Math.round(n * 100.0) / 100.0;
    }

}
