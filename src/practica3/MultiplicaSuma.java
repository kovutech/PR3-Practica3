package practica3;

import java.math.BigInteger;

public class MultiplicaSuma implements Multiplica {

    @Override
    public BigInteger multiplica(BigInteger n, BigInteger m) {
        if (m.equals(CERO)) {
            return m;
        }
        System.out.println(m);
        return n.add(multiplica(n, m.subtract(UNO)));
    }

}
