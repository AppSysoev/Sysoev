package Sysoev_4;
import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи \"I like Java!!!\"");
        String a = in.nextLine();
        if (a.contains("Java") &&  a.startsWith("I like") && a.endsWith("!!!"))
        {
            System.out.println(a.toUpperCase());
            // 5 пункт тоже попадает под проверку условий т.к. надо вывести Jovo
            a = a.replace('a', 'o');
            System.out.println(a.substring(7, 11));
        }
    }
}
