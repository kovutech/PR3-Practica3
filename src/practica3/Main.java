package practica3;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger m = new BigInteger("5");
        BigInteger n = new BigInteger("0");
        Multiplica multiplicaSuma = new MultiplicaSuma();
        System.out.println(multiplicaSuma.multiplica(m, n));
        Multiplica multiplicaRusa = new MultiplicaRusa();
        System.out.println(multiplicaRusa.multiplica(m, n));
        Multiplica multiplicaEgipcia = new MultiplicaEgipcia();
        System.out.println(multiplicaEgipcia.multiplica(m, n));
        //PruebasMain(n);
    }

    public static void PruebasMain(BigInteger n) {
        int v = 3;
        BigInteger[] tamaños = new BigInteger[v];
        for (int i = 0; i < v; i++) {
            tamaños[i] = BigInteger.TEN.pow(i).multiply(new BigInteger("5"));
        }
        DatosEstadisticos[] datosEstadisticos = new DatosEstadisticos[v];
        for (int i = 0; i < 3; i++) {
            BigInteger m = tamaños[i];
            datosEstadisticos[i] = Estadisticas.datos(n, m, true);
            double[] tiempos = datosEstadisticos[i].getTiempos();
            for (int g = 0; g <= 2; g++) {
                System.out.println(tiempos[g]);
            }
        }
    }

}
