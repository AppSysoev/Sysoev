package Sysoev_4;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        double x = in.nextDouble();
        System.out.print("Введите второе число: ");
        double y = in.nextDouble();
        System.out.print("Введите операцию: ");
        char operation = in.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.print(x + y);
                break;
            case '-':
                System.out.print(x - y );
                break;
            case '*':
                System.out.print(x * y );
                break;
            case '/':
                System.out.print(x / y );
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
    }

}
