package Sysoev_4;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи размерность массива: ");
        int c = in.nextInt();
        double[] nums = new double[c];
        for (int i = 0; i < c; i++)
        {
            System.out.println("Введи " + ( 1 + i ) + " элемент массива");
            double a = in.nextDouble();
            nums [i] = a;
        }
        double sum = 0;
        for (int i = nums.length -  1; i >= 0; i--) {
            sum = sum + nums[i];
        }
        double av = sum / nums.length;
        for ( double num :nums) {
            System.out.print(num * av + " ");
        }

    }
}
