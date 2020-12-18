package Sysoev_4;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 1, y = 2, z = 3; // константы
        System.out.print("Введи размерность массива: ");
        int c = in.nextInt();
        double[] nums = new double[c];
        for (int i = 0; i < c; i++)
        {
            System.out.println("Введи " + ( 1 + i ) + " элемент массива");
            double a = in.nextDouble();
            nums [i] = a;
        }
        for (double num : nums) {
            if(num == x || num == y || num == z)
            {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
