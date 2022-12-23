import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x from -1 to 1: ");
        BigDecimal x = new BigDecimal(scanner.next());
        System.out.print("Enter k: ");
        BigInteger k = new BigInteger(scanner.next());

        BigDecimal sum = new BigDecimal(String.valueOf(Teilor.calculateTeilor(x, k)));
        double standartSum = Math.log(x.doubleValue() + 1);

        System.out.println("Teilor   Ln(x+1) = " + sum);
        System.out.println("Standart Ln(x+1) = " + standartSum);
    }
}
