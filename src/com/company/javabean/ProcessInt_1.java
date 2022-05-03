package com.company.javabean;

/*
первый обработчик возвращает их сумму, среднее значение,
минимальный и максимальный элемент
*/

public class ProcessInt_1 implements ProcessInt, Runnable {
    private static double sum;      // Сумма всех данных
    private static double average;  // Среднее значение
    private static double min;      // Минимальное значение
    private static double max;      // Максимальное значение

    int[] Array;                    // Массив с данными
    int N;                          // Объем данных

    public ProcessInt_1() {
        this.Array = Generate.getArray_int();
        this.N = Generate.getN();
    }

    @Override
    public void run() {
        process(Generate.getN(), Generate.getArray_int());
    }

    public void process(int N, int[] Array_Int) {
        var processObserverInt1 = new ProcessObserver();
        new Logger("Обработчик целых №1", processObserverInt1);

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

        processObserverInt1.setContent("\nСумма = " + ProcessInt_1.getSum() +
                "\nМинимальное значение = " + ProcessInt_1.getMin() +
                "\nМаксимальное значение = " + ProcessInt_1.getMax() +
                "\nСреднее значение = " + ProcessInt_1.getAverage());
    }

    public static double getSum() { return sum; }
    public static double getAverage() { return average; }
    public static double getMin() { return min; }
    public static double getMax() { return max; }


}
