package Sysoev_4;
import java.util.Random;

public class fourteen {
    public static void main(String[] args) {
       int array [] = new int[15];
       int min = 21;
       int max = -21;
       Random random = new Random();
        for (int ar: array)
        {
            array[ar] = -20 + random.nextInt(41);
            if (array[ar] > max)
                max = array[ar];
            if (array[ar] < min)
                min = array[ar];
        }
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Минимальное значение в массиве: " + min);
        if (Math.abs(max) > Math.abs(min))
            System.out.println("Максимальное значение по модулю в массиве: " + max);
        else
            System.out.println("Максимальное значение по модулю в массиве: " + min);

    }
}
