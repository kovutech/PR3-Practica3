package practica3;

import java.math.BigInteger;
import static java.lang.System.nanoTime;

public class Estadisticas {

    public static DatosEstadisticos datos(BigInteger n, BigInteger m, boolean A) {
        DatosEstadisticos datosEstadisticos = new DatosEstadisticos();
        BigInteger resCierto = n.multiply(m);
        Multiplica mul = new MultiplicaSuma();
        if (A == true) {
            datosEstadisticos.setResSuma(new MultiplicaSuma().multiplica(n, m));
            if (!resCierto.equals(datosEstadisticos.getResultado()[0])) {
                System.out.println("ERROR");
            }
            datosEstadisticos.TiempoSuma(repetir(n, m, mul));
        }
        mul = new MultiplicaRusa();
        datosEstadisticos.setResRusa(new MultiplicaRusa().multiplica(n, m));
        if (!resCierto.equals(datosEstadisticos.getResultado()[1])) {
            System.out.println("ERROR");
        }
        datosEstadisticos.TiempoSuma(repetir(n, m, mul));
        mul = new MultiplicaEgipcia();
        datosEstadisticos.setResEgipcio(new MultiplicaEgipcia().multiplica(n, m));
        if (!resCierto.equals(datosEstadisticos.getResultado()[2])) {
            System.out.println("ERROR");
        }
        datosEstadisticos.TiempoSuma(repetir(n, m, mul));
        return datosEstadisticos;
    }

    private static double repetir(BigInteger n, BigInteger m, Multiplica mul) {
        long Tiempo;
        long sumatiempos = 0;
        double repeticiones = 1000000;
        for (int i = 0; i < repeticiones; i++) {
            Tiempo = nanoTime();
            mul.multiplica(n, m);
            sumatiempos += nanoTime() - Tiempo;
        }
        return sumatiempos / (1000000000 * repeticiones);
    }
}
