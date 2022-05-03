package com.company.javabean;
import java.util.Scanner;

public class Choice
{
    public Choice() { }

    public int choice(int CKey)
    {
        Scanner sc = new Scanner(System.in);
        int key;
        switch (CKey)
        {
            case 1:
                System.out.println("Введите объем баззы данных: ");
                System.out.println("Случайный генератор случайных целых чисел, либо строк\n");
                System.out.println("1. Сгенерировать случайные целые числа");
                System.out.println("2. Сгенерировать случайные строки");
                System.out.print("Введите нужное действие: ");
                key = sc.nextInt();
                System.out.println();
                return key;

            case 2:
                System.out.println("Какие значения удалить?");
                System.out.println("1 - Нечетные");
                System.out.println("2 - Четные");
                key = sc.nextInt();
                System.out.println();
                return key;

            default:
                return 0;
        }
    }
}
