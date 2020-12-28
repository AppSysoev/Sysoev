package Sysoev_4;
import java.util.Scanner;

public class Total_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи уравнение: ");
        String a = in.nextLine();
        int y = 0;
        // сначала проверки на корректный ввод
        if (a.length() != 5  || a.charAt(3) != '=' || (a.charAt(1) != '+' && a.charAt(1) != '-'))
        {
            System.out.println("Неправильно введено уравнение");
            System.exit(0);
        }
        if (((a.charAt(0) != 'x'  && a.charAt(2) != 'x' && a.charAt(4) != 'x')))
        {
            System.out.println("В уравнении нужен х");
            System.exit(0);
        }
        if (((a.charAt(0) == 'x'  && a.charAt(2) == 'x' ) || ((a.charAt(2) == 'x'  && a.charAt(4) == 'x')) ||
                ((a.charAt(0) == 'x'  && a.charAt(4) == 'x'))))
        {
            System.out.println("Много неизвестных");
            System.exit(0);
        }
        // тут решения каждого случая

        if ((a.charAt(0) == 'x') && Character.isDigit(a.charAt(2)) && Character.isDigit(a.charAt(4)) && a.charAt(1) == '+')
        {
            y = Character.getNumericValue(a.charAt(4)) - Character.getNumericValue(a.charAt(2));
            System.out.println("Вывод: " + y);
        }
        else if ((a.charAt(0) == 'x') && Character.isDigit(a.charAt(2)) && Character.isDigit(a.charAt(4)) && a.charAt(1) == '-')
        {
            y = Character.getNumericValue(a.charAt(4)) + Character.getNumericValue(a.charAt(2));
            System.out.println("Вывод: " + y);
        }
        else if ((a.charAt(2) == 'x') && Character.isDigit(a.charAt(0)) && Character.isDigit(a.charAt(4)) && a.charAt(1) == '+')
        {
            y = Character.getNumericValue(a.charAt(4)) - Character.getNumericValue(a.charAt(0));
            System.out.println("Вывод: " + y);
        }
        else if ((a.charAt(2) == 'x') && Character.isDigit(a.charAt(0)) && Character.isDigit(a.charAt(4)) && a.charAt(1) == '-')
        {
            y = Character.getNumericValue(a.charAt(4)) + Character.getNumericValue(a.charAt(0));
            System.out.println("Вывод: " + y);
        }
        else if ((a.charAt(4) == 'x') && Character.isDigit(a.charAt(0)) && Character.isDigit(a.charAt(2)) && a.charAt(1) == '+')
        {
            y = Character.getNumericValue(a.charAt(0)) + Character.getNumericValue(a.charAt(2));
            System.out.println("Вывод: " + y);
        }
        else if ((a.charAt(4) == 'x') && Character.isDigit(a.charAt(0)) && Character.isDigit(a.charAt(2)) && a.charAt(1) == '-')
        {
            y = Character.getNumericValue(a.charAt(0)) - Character.getNumericValue(a.charAt(2));
            System.out.println("Вывод: " + y);
        }
        else
        {
            System.out.println("Неправильный ввод!");
        }
    }
}
