package practica3;

import java.math.BigInteger;

public interface Multiplica {

    final BigInteger CERO = BigInteger.ZERO;
    final BigInteger UNO = BigInteger.ONE;
    final BigInteger DOS = new BigInteger("2");

    public BigInteger multiplica(BigInteger n, BigInteger m);
}
