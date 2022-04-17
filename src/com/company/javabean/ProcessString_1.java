package com.company.javabean;

/*
Первый обработчик — возвращает «склеенную» строку
*/

public class ProcessString_1 implements ProcessString
{
    private static String[] Array_2;    // Массив для склееных строк

    public static String[] getArray_2() { return Array_2; }

    String[] Array;     // Массив сгенерированных строк
    int N;              // Объем данных

    public ProcessString_1()    // Конструктор
    {
        this.Array = Generate.getArray_Str();
        this.N = Generate.getN();
    }

    public void process(int N, String[] Array_Str)  // Склейка строк
    {
        Logger logger = new Logger();
        Array_2 = new String[N];
        for(int i = 0; i < N; i++) {
            String edited = Array[i].replaceAll(" ", "");
            Array_2[i] = edited;
        }
        logger.getContent(3);       // Логгер для первого обработчика строк
    }
}
