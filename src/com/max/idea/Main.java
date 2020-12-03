package com.max.idea;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Первое задание
        System.out.println("Hello World!");
        // Второе задание
        double a;
        a = 19.65D;
        byte b;
        b = 12;
        //Третье задание
        int []c = new int[]{1, 2, 3, 4, 5};
        int x= c[0];
        c[0] = c[c.length-1];
        c[c.length-1] = x;
        //Проверка смены мест элементов
        //System.out.println(Arrays.toString(c));
        int y=c[0]+c[c.length/2];
        System.out.println(y);
    }
}


