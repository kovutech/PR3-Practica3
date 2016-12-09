package practica3;

import java.math.BigInteger;

public class DatosEstadisticos {

    private final double[] tiempos = new double[3];
    private final BigInteger[] ArrayTiempos = new BigInteger[3];

    public void TiempoSuma(double time) {
        this.tiempos[0] = time;
    }

    public void TiempoRusa(double time) {
        this.tiempos[1] = time;
    }

    public void TiempoEgipcia(double time) {
        this.tiempos[2] = time;
    }

    public void setResSuma(BigInteger time) {
        this.ArrayTiempos[0] = time;
    }

    public void setResRusa(BigInteger time) {
        this.ArrayTiempos[1] = time;
    }

    public void setResEgipcio(BigInteger time) {
        this.ArrayTiempos[2] = time;
    }

    public double[] getTiempos() {
        return tiempos;
    }

    public BigInteger[] getResultado() {
        return ArrayTiempos;
    }

}
