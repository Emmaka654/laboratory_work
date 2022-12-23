import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Teilor {
    public static BigDecimal calculateTeilor(BigDecimal x, BigInteger k) {
        BigDecimal ten = new BigDecimal("10");
        BigDecimal one = new BigDecimal("1");
        BigDecimal i = new BigDecimal("1");
        BigDecimal minusOne = new BigDecimal("-1");

        BigDecimal e = new BigDecimal(String.valueOf(one.divide(ten.pow(k.intValue()))));
        BigDecimal slag = new BigDecimal("0");
        BigDecimal sum = new BigDecimal("0");


        do {
            slag = x.pow(i.intValue())
                    .divide(i, k.intValue() + 1, RoundingMode.HALF_UP)
                    .multiply(minusOne
                            .pow(i.add(one).intValue()));
            sum = sum.add(slag);
            i = i.add(one);
        } while (slag.abs().compareTo(e) == 1);

        return sum;
    }
}