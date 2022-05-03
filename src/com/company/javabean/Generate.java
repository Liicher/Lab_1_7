package com.company.javabean;

import java.util.Random;

public class Generate
{
    private static final int N = 5;                             // Размер объема данных (изменяется здесь)
    private static final int[] Array_int = new int[N];          // Массив для целлочисленных данных
    private static final String[] Array_Str = new String[N];    // Массив для строк
    private static int ArrKey;                                  // Переменная для выбранного типа данных

    public Generate() {
        Choice choice = new Choice();
        ArrKey = choice.choice(1);
    }

    public void generate() {
        switch (ArrKey) {
            // Генерация целочисленных данных
            case 1:
                for(int i = 0; i < N; i++) {
                    Array_int[i] = 1 + (int) ( Math.random() * 100 );
                    System.out.print(Array_int[i] + " ");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {}
                }
                System.out.println();
                break;

            // Генерация строк
            case 2:
                String str="abcdefghijklmnopqrstuvwxyz";
                for(int j = 0; j < N; j++) {
                    Random random = new Random();
                    StringBuilder sb = new StringBuilder();

                    // Генерация случайной длины строки
                    int Rand = 5 + (int) (Math.random()*100);
                    int len = 5 + (int) (Math.random() * Rand);
                    boolean flag = false;

                    // Генерация самой строки
                    for (int i = 0; i < len; i++) {
                        int number=random.nextInt(30);

                        // Проверка на двойной пробел
                        while(!flag) {
                            number=random.nextInt(30);
                            if(number < 26) {
                                flag = true;
                            }
                        }

                        // Если пробел
                        if(number >= 26) {
                            flag = false;
                            sb.append(" ");
                        }
                        else // Какой-то символ
                        {
                            sb.append(str.charAt(number));
                        }
                    }
                    Array_Str[j] = sb.toString();
                }

                // Вывод массива строк
                for(int i = 0; i<N; i++) {
                    System.out.println(Array_Str[i]);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {}
                }
                System.out.println();
                break;

            default:
                break;
        }
    }

    public static int getArrKey() { return ArrKey; }
    public static int getN() { return N; }
    public static int[] getArray_int() { return Array_int; }
    public static String[] getArray_Str() { return Array_Str; }
}
