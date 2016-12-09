package practica3;

import java.math.BigInteger;

public class MultiplicaEgipcia implements Multiplica {

    @Override
    public BigInteger multiplica(BigInteger n, BigInteger m) {
        return multiplicacionEgipcia(n, m, UNO)[0];
    }

    private BigInteger[] multiplicacionEgipcia(BigInteger n, BigInteger m, BigInteger doble1) {
        BigInteger[] ps = {CERO, CERO};
        if (doble1.compareTo(m) < 1) {
            ps = multiplicacionEgipcia(n, m, doble1.multiply(DOS));
            if (ps[1].add(doble1).compareTo(m) <= 0) {
                ps[0] = ps[0].add(n.multiply(doble1));
                ps[1] = ps[1].add(doble1);
            }
        }
        return ps;
    }
}
