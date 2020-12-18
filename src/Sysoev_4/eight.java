package Sysoev_4;
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи целое положительное число: ");
        int c = in.nextInt();
        if (c <= 0)
            System.out.println("Это не положительное");
        int sum = 0;
        for( int i = 1; i < c; i = i + 2)
        {
            sum = sum + i;
        }
        System.out.println("Сумма нечётных чисел = " + sum);
    }
}
