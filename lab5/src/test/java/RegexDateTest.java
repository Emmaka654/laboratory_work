import org.testng.annotations.Test;

import java.io.IOException;


import static org.testng.AssertJUnit.assertEquals;

class RegexDateTest {

    @Test
    void isOkey1() throws IOException {
        String str = "29/02/0899";
        RegexDate gd = new RegexDate();
        assertEquals(true, gd.isOkey(str));
    }

    @Test
    void isOkey2() throws IOException {
        String str = "30/04/0999";
        RegexDate gd = new RegexDate();
        assertEquals(true, gd.isOkey(str));
    }

    @Test
    void isOkey3() throws IOException {
        String str = "30-04-2003";
        RegexDate gd = new RegexDate();
        assertEquals(false, gd.isOkey(str));
    }
}