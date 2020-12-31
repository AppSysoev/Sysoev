package Sysoev_4;
import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить:\n1 - масса, 2 - расстояние: ");
        int a = in.nextInt();
        if (a == 1)
        {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - стоун, 3 - фунт, 4 - унция: ");
            int b = in.nextInt();
            System.out.println("Введите число: ");
            double c = in.nextDouble();
            System.out.println("Результат:");
            switch (b) {
                case 1:
                    System.out.println("Граммы: " + c);
                    System.out.printf("Стоуны: %.3f \n", c / 6350.29318);
                    System.out.printf("Фунты: %.2f \n", c / 453.59237);
                    System.out.printf("Унции: %.2f \n", c / 28.34952312);
                    break;
                case 2:
                    System.out.printf("Граммы: %.3f \n", c * 6350.29318);
                    System.out.println("Стоуны: " + c );
                    System.out.printf("Фунты: %.2f \n", c / 453.59237 * 6350.29318);
                    System.out.printf("Унции: %.2f \n", c / 28.34952312 * 6350.29318);
                    break;
                case 3:
                    System.out.printf("Граммы: %.3f \n", c * 453.59237);
                    System.out.printf("Стоуны: %.3f \n", c / 6350.29318 * 453.59237);
                    System.out.println("Фунты: " + c );
                    System.out.printf("Унции: %.2f \n", c / 28.34952312 * 453.59237);
                    break;
                case 4:
                    System.out.printf("Граммы: %.3f \n", c * 28.34952312);
                    System.out.printf("Стоуны: %.3f \n", c / 6350.29318 * 28.34952312);
                    System.out.printf("Фунты: %.2f \n", c / 453.59237 * 28.34952312);
                    System.out.println("Унции: " + c );
                    break;
                default:
                    System.out.println("Не знаем такой единицы измерения");
                    break;
            }

        }
        else if (a == 2)
        {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
            int b = in.nextInt();
            System.out.println("Введите число: ");
            double c = in.nextDouble();
            System.out.println("Результат:");
            switch (b) {
                case 1:
                    System.out.println("Метры: " + c);
                    System.out.printf("Мили: %.3f \n", c / 1609.344);
                    System.out.printf("Ярды: %.2f \n", c / 0.9144);
                    System.out.printf("Фут: %.2f \n", c / 0.3048);
                    break;
                case 2:
                    System.out.printf("Метры: %.3f \n", c * 1609.344);
                    System.out.println("Мили: " + c );
                    System.out.printf("Ярды: %.2f \n", c / 0.9144 * 1609.344);
                    System.out.printf("Фут: %.2f \n", c / 0.3048 * 1609.344);
                    break;
                case 3:
                    System.out.printf("Метры: %.3f \n", c * 0.9144);
                    System.out.printf("Мили: %.3f \n", c / 1609.344 * 0.9144);
                    System.out.println("Ярды: " + c );
                    System.out.printf("Фут: %.2f \n", c / 0.3048 * 0.9144);
                    break;
                case 4:
                    System.out.printf("Метры: %.3f \n", c * 0.3048);
                    System.out.printf("Мили: %.3f \n", c / 1609.344 * 0.3048);
                    System.out.printf("Ярды: %.2f \n", c / 0.9144 * 0.3048);
                    System.out.println("Футы: " + c );
                    break;
                default:
                    System.out.println("Не знаем такой единицы измерения");
                    break;
            }

        }
        else
            {
                System.out.println("Неправильный ввод");
            }

    }
}