package practica3;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger m = new BigInteger("6");
        BigInteger n = new BigInteger("3");
        PruebasMain(n, m);
    }

    public static void PruebasMain(BigInteger n, BigInteger m) {
        Integer x = 6;
        BigInteger[] tamaños = new BigInteger[x];
        for (int i = 0; i < x; i++) {
            tamaños[i] = BigInteger.TEN.pow(i).multiply(m);
        }
        DatosEstadisticos[] datosEstadisticos = new DatosEstadisticos[x];
        System.out.println("Tam. ristras\tTiempo Sumas\tTiempo Rusa\tTiempo Egipcia");
        double[] tiempos;
        for (int i = 0; i < 6; i++) {
            m = tamaños[i];
            if (i <= 2) {
                datosEstadisticos[i] = Estadisticas.datos(n, m, true);
            } else {
                datosEstadisticos[i] = Estadisticas.datos(n, m, false);
            }
            tiempos = datosEstadisticos[i].getTiempos();
            System.out.print("x" + (i + 1) + "\t\t");
            for (int g = 0; g <= 2; g++) {
                if (tiempos[g] == 0) {
                    System.out.print("---\t\t");
                } else {
                    System.out.print(tiempos[g] + "\t");
                }
            }
            System.out.println("");
        }
        System.out.print("\n\n\n\n");
        System.out.println("Tam. ristras\tResult. Sumas\tResult. Rusa\tResult. Egipcia");
        for (int i = 0; i < 3; i++) {
            BigInteger[] resultados = datosEstadisticos[i].getResultado();
            System.out.print("x" + (i + 1) + "\t\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(resultados[j] + "\t\t");
            }
            System.out.println("");
        }
    }

}
