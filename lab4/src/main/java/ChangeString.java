import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChangeString {

    public String sortWithL(String[] masOfStrings) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String str : masOfStrings) {
            arrayList.add(str);
        }
        arrayList.sort((p1, p2) -> countAmountOfLatin(p1) - countAmountOfLatin(p2));
        return arrayList.toString();
    }

    public int countAmountOfLatin(String str) {
        int size = 0;
        for (int i = 0; i < str.length(); i++) {
            String str1 = String.valueOf(str.charAt(i));
            if (str1.matches("[a-zA-Z]+")) {
                size++;
            }
        }
        return size;
    }

    public StringBuffer insertNumWithMinus(String inputString, int[] masOfNumbers) {
        int numWithMinus = masOfNumbers[(int) (Math.random() * masOfNumbers.length)] * (-1);
        StringBuffer inputStringSB = new StringBuffer(inputString);
        return inputStringSB.insert(inputStringSB.length() / 2, numWithMinus);
    }

    public String[] isLatin(String[] masOfStrings) {
        String[] masOfLatin = new String[50];
        int size = 0;
        for (int i = 0, j = 0; i < masOfStrings.length; i++) {
            if (masOfStrings[i].matches("[a-zA-Z]+")) {
                masOfLatin[j++] = masOfStrings[i];
                size++;
            }
        }
        return Arrays.copyOf(masOfLatin, size);
    }

    public int[] isNumbers(String[] masOfStrings) {
        int[] masOfNumbers = new int[50];
        int size = 0;
        for (int i = 0, j = 0; i < masOfStrings.length; i++) {
            if (isNumeric(masOfStrings[i])) {
                masOfNumbers[j++] = Integer.parseInt(masOfStrings[i]);
                size++;
            }
        }
        return Arrays.copyOf(masOfNumbers, size);
    }

    public String[] tokenise(String inputString, String inputSeparators) {
        StringTokenizer stringTokenizer = new StringTokenizer(inputString, inputSeparators);
        String[] masOfStrings = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            masOfStrings[i++] = stringTokenizer.nextToken();
        }
        return masOfStrings;
    }

    public int[] tokeniseNumbers(String[] masOfStrings) {
        int[] masOfNumbers = new int[50];
        int size = 0;
        for (int i = 0, j = 0; i < masOfStrings.length; i++) {
            if (isAnyNumeric(masOfStrings[i])) {
                masOfNumbers[j++] = Integer.parseInt(masOfStrings[i]);
                size++;
            }
        }
        return Arrays.copyOf(masOfNumbers, size);
    }

    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str, 8);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isAnyNumeric(String str) {
        try {
            Integer.parseInt(str, 10);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
