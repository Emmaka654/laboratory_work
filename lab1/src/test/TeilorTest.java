package tests;

import org.junit.jupiter.api.Test;
import tailor.Teilor;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeilorTest {

    @Test
    public void calculateTeilor() {
        BigDecimal x = new BigDecimal("0.5");
        BigInteger k = new BigInteger("4");
        Teilor t = new Teilor();
        BigDecimal right = new BigDecimal("0.40544");
        assertEquals(right, t.calculateTeilor(x, k));
    }
}