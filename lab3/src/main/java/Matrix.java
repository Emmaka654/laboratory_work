import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Matrix {

    public static void showMas(Double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(new DecimalFormat("\t#.###\t").format(mas[i]) + " ");
        }
    }

    public static Double[][] createNewMatrix(int n, Double[][] matrix, Double minElem) {
        int row = 0;
        int column = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minElem) {
                    row = i;
                    column = j;
                }
            }
        }
        Double[][] newMatrix = new Double[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (j < column && i < row) {
                    newMatrix[i][j] = matrix[i][j];
                } else if (i == row || j == column) {
                    newMatrix[i][j] = minElem;
                } else {
                    if (i < row) {
                        newMatrix[i][j] = matrix[i][j - 1];
                    } else if (j < column) {
                        newMatrix[i][j] = matrix[i - 1][j];
                    } else {
                        newMatrix[i][j] = matrix[i - 1][j - 1];
                    }
                }
            }
        }
        return newMatrix;
    }

    public static Double findMinElem(int n, Double[][] matrix) {
        Double minElem = matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < minElem) {
                    minElem = matrix[i][j];
                }
            }
        }
        return minElem;
    }

    public static void showMatrix(Double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(new DecimalFormat("\t#.###\t").format(matrix[i][j]));
            }
            System.out.println();
        }
    }

    public static void showMatrixWithFormater(Double[][] matrix) {
        NumberFormat format1 = NumberFormat.getPercentInstance(Locale.CANADA);
        NumberFormat format2 = NumberFormat.getCurrencyInstance(Locale.CANADA);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 1) {
                    System.out.print("\t" + format1.format(matrix[i][j]) + "\t");
                } else if (i == 2) {
                    System.out.print("\t" + format2.format(matrix[i][j]) + "\t");
                } else {
                    System.out.print(new DecimalFormat("\t#.###\t").format(matrix[i][j]));
                }
            }
            System.out.println();
        }
    }

    public static void generateMatrix(int n, Double[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.random() * 100;
            }
        }
    }
}
