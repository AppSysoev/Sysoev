package Sysoev_4;
import java.util.Scanner;

public class Total_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество строк: ");
        int a = in.nextInt();
        String[] strings = new String[a];
        int[] sums = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Введи данные " + (1 + i) + " строки");
            strings[i] = in.next(); //  если оставить in.nextLine(); он почему то сжирает ввод 1 строки, а так не даёт ввести составную строку в значение массива
        }
        int c = 0;
        int max = 0;
        int z = 0;
        for (String str : strings) {
            char[] b = str.toCharArray();
            boolean isUniq = true;
            int UniQ = 0;
            for (int i = 0; i < b.length; i++)
            {
                if(isUniq)
                {
                    UniQ++;
                }
                for (int j = i + 1; j < b.length; j++)
                {
                    if (b[i] == b[j])
                    {
                        isUniq = false;
                        break;
                    }
                    else  if (b[i] != b[j])
                    {
                        isUniq = true;
                    }
                }
            }
            System.out.println("количество уникальных символов = " + UniQ);
            sums[c] = UniQ;
            if (sums[c] > max)
            {
                max = sums[c];
                z = c;
            }
            c++;
        }
        System.out.println("Ответ: " + strings[z]);
    }
}

