package dString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CurrencyRecognitionTest {
    @Test
    public void isCurrencyTest() {
        /* Valid:
           $450
           -ву23
           (?2400)
           $4,500.00
           ву0.25
         */

        /* Invalid:
           cat
           (ву350
           (-$3.50)
           ?120.00  ???
         */
        boolean res = CurrencyRecognition.isCurrency("$450");
        assertEquals(true, res);
    }
}
