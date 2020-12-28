package Sysoev_4;
import java.util.Scanner;

public class Total_4 {
    public static void main(String[] args) {
        System.out.println("Загадка: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner in = new Scanner(System.in);
        boolean help = true;
        for (int i = 1; i <= 3; i++)
        {
            System.out.print("Ответ: ");
            String ans = in.nextLine();
            if (ans.compareTo("Заархивированный вирус") == 0)
            {
                System.out.println("Правильно!");
                break;
            }
            else if( i == 1 && ans.compareTo("Подсказка") == 0)
            {
                System.out.println("вирус Заархивированный");
                i--;
                help = false;
                continue;
            }
            else if( i != 1 && ans.compareTo("Подсказка") == 0)
            {
                System.out.println("Подсказка уже недоступна");
                i--;
            }
            else if (help == false)
            {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
            else if (ans.compareTo("Заархивированный вирус") != 0 && i != 3)
            {
                System.out.println("Подумай еще!");
            }
            else if (ans.compareTo("Заархивированный вирус") != 0 && i == 3)
            {
                System.out.println("Ты не прав");
            }


        }

    }
}
