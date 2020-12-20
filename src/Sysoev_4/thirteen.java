package Sysoev_4;
import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        int sum = 0;
        boolean c = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Введи что хотел");
        String a = in.nextLine();
        a = a.trim();
        String[] smash = a.split(" ");
        for (String sm : smash)
        {
            char[] b = sm.toCharArray();
            c = true;
            for (char ch : b)
            {
                if (!Character.isLetter(ch) || Character.UnicodeBlock.of(ch).equals(Character.UnicodeBlock.CYRILLIC))
                {
                    c = false;
                }
            }
            if ( c == true)
            {
                System.out.print(sm + " ");
                sum++;
            }
        }
        System.out.println("\nКоличество слов на латинице: " + sum);
    }
}


