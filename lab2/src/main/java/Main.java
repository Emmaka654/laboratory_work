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
        System.out.format("K hex: %+x %nK octal: %o %n", k, k);

        BigDecimal sum = new BigDecimal(String.valueOf(Teilor.calculateTeilor(x, k)));
        double standartSum = Math.log(x.doubleValue() + 1);

        System.out.format("Teilor   Ln(x+1) = %010f %n", sum);//минимальная ширина поля
        System.out.format("Standart Ln(x+1) = %#.5f %n", standartSum);//точность
        System.out.format("%3$,d %1$(d %2$d", -10, 20, 300000000);//порядковый номер
    }
}