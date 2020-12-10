package Sysoev_4;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите y: ");
        double y = in.nextDouble();
        System.out.print("Введите z: ");
        double z = in.nextDouble();
        double a = (x + y + z) / 3;
        System.out.println(a);
        double b = Math.floor(a / 2);
        if (b > 3){
            System.out.println("Программа выполнена корректно");
        }

    }

}
