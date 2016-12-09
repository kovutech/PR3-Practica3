package practica3;

import java.math.BigInteger;

public class MultiplicaRusa implements Multiplica {

    @Override
    public BigInteger multiplica(BigInteger n, BigInteger m) {
        if (n.compareTo(UNO) >= 0) {
            if ((n.mod(DOS).equals(UNO))) {
                return m.add(multiplica(n.divide(DOS), m.multiply(DOS)));
            } else {
                return multiplica(n.divide(DOS), m.multiply(DOS));
            }
        }
        return CERO;
    }

}
