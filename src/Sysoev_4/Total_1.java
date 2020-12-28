package Sysoev_4;
import java.util.Scanner;


public class Total_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double a = in.nextDouble();
        System.out.print("Количество рублей: ");
        double b = in.nextDouble();
        System.out.printf("Итого: %.2f долларов", b/a );
    }
}
