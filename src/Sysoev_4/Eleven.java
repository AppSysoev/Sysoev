package Sysoev_4;
import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи число для записи в строку");
        String a = Integer.toString(in.nextInt());
        System.out.println("Введи второе число ");
        int b = in.nextInt();
        if (Integer.parseInt(a) > b)
        {
            System.out.println(a);
            double c = b;
            System.out.println(c);

        }
        else
        {
            System.out.println(b);
            System.out.println(Double.parseDouble(a));
        }
    }
}
