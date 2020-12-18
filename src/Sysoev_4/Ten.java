package Sysoev_4;
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество строк: ");
        int a = in.nextInt();
        System.out.print("Введи количество столбцов: ");
        int b = in.nextInt();
        double[][] nums = new double[a][b];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
        {
            System.out.println("Введи данные "  + ( 1 + i ) + " строки " + ( 1 + j ) + " столбца");
            double c = in.nextDouble();
            nums [i][j] = c;
        }
        for (int i = 0; i <= 0; i++) {  // идём по 1 строке
            for (int j = 0; j < b; j++) {  // идём по столбцам
                double z =nums[i][j] * 3.0;
                System.out.printf(" %.4f", z );  // вывод элемента с округленим - без него что-то странное
            }
        }
    }
}
