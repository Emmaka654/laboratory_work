
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class ChangeStringTest {

    @Test
    void countAmountOfLatin() {
        String str = "zxfg123vh";
        ChangeString cs = new ChangeString();
        assertEquals(6, cs.countAmountOfLatin(str));
    }

}