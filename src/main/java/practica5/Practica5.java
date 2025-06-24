package practica5;

import practica5.fig.PoligonoRegular;
import practica5.fig.Cuadrado;
import practica5.fig.Pentagono;
import practica5.fig.Triangulo;

/**
 * Clase para probar ejemplares de {@code PoligonoRegular}.
 * @author Nombre
 * @version 1.0
 */
public class Practica5 {

    /**
     * Ejecuta el programa principal.
     * @param args {@code <String[]>} : argumentos.
     */
    public static void main(String[] args) {
        
        // 1. Se crean los objetos
        PoligonoRegular<Integer> t1 = new Triangulo<Integer>(6);
        PoligonoRegular<Double> c1 = new Cuadrado<Double>(4.7);
        PoligonoRegular<Long> p1 = new Pentagono<Long>(34L);
        PoligonoRegular<Short> t2 = new Triangulo<Short>((short) 6);
        PoligonoRegular<Float> c2 = new Cuadrado<Float>( 4.7f);
        PoligonoRegular<Byte> p2 = new Pentagono<Byte>((byte)7);
        PoligonoRegular<Integer> t3 = new Triangulo<Integer>(6);

        // 2. Se imprimen los objetos.
        System.out.println("t1:\n" + t1);
        System.out.println("c1:\n" + c1);
        System.out.println("p1:\n" + p1);
        System.out.println("t2:\n" + t2);
        System.out.println("c2:\n" + c2);
        System.out.println("p2:\n" + p2);
        System.out.println("t3:\n" + t3);

        // 3. Se comparan
        System.out.println("t1 es igual a t2?: " + t1.equals(t2));
        System.out.println("c1 es igual a c2?: " + c1.equals(c2));
        System.out.println("p1 es igual a t2?: " + p1.equals(t2));
        System.out.println("t1 es igual a t3?: " + t1.equals(t3));

    }
}