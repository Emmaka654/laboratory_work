import java.io.*;
import java.util.regex.Pattern;

public class RegexDate {
    public boolean isOkey(String line) throws IOException {
        if (Pattern.matches("^(30|31|([0-2][1-9]))" +
                "\\/(12|11|10|(0[1-9]))" +
                "\\/((1000)|(0\\d{2}[1-9])|(0\\d[1-9]\\d)|(0[1-9]\\d\\d))$", line)) {
            return true;
        } else {
            return false;
        }
    }
}
