package com.company.javabean;

/*
второй обработчик — удаляет из списка четные или
нечетные элементы, в зависимости от настройки.
*/

public class ProcessInt_2 implements ProcessInt, Runnable {
    private static int[] Array_2;
    private static int count = 0;

    int[] Array;
    int N;

    public ProcessInt_2() {
        this.Array = Generate.getArray_int();
        this.N = Generate.getN();
    }

    @Override
    public void run() {
        process(Generate.getN(), Generate.getArray_int());
    }

    public void process(int N, int[] Array_Int) {
        var processObserverInt2 = new ProcessObserver();
        new Logger("Обработчик целых №2", processObserverInt2);

        Choice choice = new Choice();       // Метод выбора
        //int key = choice.choice(2);   // Выбор пользователя
        int key = 1;
        int j = 0;

        switch (key) {
            // Удаление нечетных
            case 1:
                for (int i = 0; i < N; i++) {
                    if (Array_Int[i]%2 == 0) {
                        count++;
                    }
                }

                Array_2 = new int[count];
                for (int i = 0; i < N; i++) {
                    if (Array_Int[i]%2 == 0) {
                        Array_2[j] = Array_Int[i];
                        j++;
                    }
                }

                StringBuilder sb1 = new StringBuilder();
                for(int i = 0; i < ProcessInt_2.getCount(); i++) {
                    sb1.append(Array_2[i]).append(" ");
                }
                processObserverInt2.setContent("Обновленный массив - " + sb1);
                break;

            // Удаление четных
            case 2:
                for (int i = 0; i < N; i++) {
                    if (Array_Int[i]%2 == 1) {
                        count++;
                    }
                }

                Array_2 = new int[count];
                for (int i = 0; i < N; i++) {
                    if (Array_Int[i]%2 == 1) {
                        Array_2[j] = Array_Int[i];
                        j++;
                    }
                }

                StringBuilder sb2 = new StringBuilder();
                for(int i = 0; i < ProcessInt_2.getCount(); i++) {
                    sb2.append(Array_2[i]).append(" ");
                }
                processObserverInt2.setContent("Обновленный массив - " + sb2);
                break;

            default:
                break;
        }
    }

    public static int[] getArray_2() { return Array_2; }
    public static int getCount() { return count; }
}
