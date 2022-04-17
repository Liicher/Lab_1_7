package com.company.javabean;

/*
первый обработчик возвращает их сумму, среднее значение,
минимальный и максимальный элемент
*/

public class ProcessInt_1 implements ProcessInt
{
    private static double sum;      // Сумма всех данных
    private static double average;  // Среднее значение
    private static double min;      // Минимальное значение
    private static double max;      // Максимальное значение

    int[] Array;                    // Массив с данными
    int N;                          // Объем данных

    public ProcessInt_1()           // Конструктор
    {
        this.Array = Generate.getArray_int();
        this.N = Generate.getN();
    }

    public void process(int N, int[] Array_Int)
    {
        sum = 0;                        // Сумма
        average = 0;                    // Среднее значение
        min = 1000;                     // Минимальное значение
        max = 0;                        // Максимальное значение

        for(int i = 0; i < N; i++) {
            sum = sum + Array_Int[i];

            if (Array_Int[i] < min) {
                min = Array_Int[i];
            }

            if (Array_Int[i] > max) {
                max = Array_Int[i];
            }
        }
        average = sum / N;

        Logger logger = new Logger();
        logger.getContent(1);       // Логгер для первого обработчика целых чисел
    }

    public static double getSum() { return sum; }
    public static double getAverage() { return average; }
    public static double getMin() { return min; }
    public static double getMax() { return max; }
}
