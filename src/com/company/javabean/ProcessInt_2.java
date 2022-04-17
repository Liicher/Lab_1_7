package com.company.javabean;

/*
второй обработчик — удаляет из списка четные или
нечетные элементы, в зависимости от настройки.
*/

public class ProcessInt_2 implements ProcessInt
{
    private static int[] Array_2;
    private static int count = 0;

    public static int[] getArray_2() { return Array_2; }
    public static int getCount() { return count; }

    int[] Array;
    int N;

    public ProcessInt_2()
    {
        this.Array = Generate.getArray_int();
        this.N = Generate.getN();
    }

    public void process(int N, int[] Array_Int)
    {
        Logger logger = new Logger();
        Choice choice = new Choice();       // Метод выбора
        int key = choice.choice(2);   // Выбор пользователя
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
                logger.getContent(2);
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
                logger.getContent(2);       // Логгер для второго обработчика целых чисел
                break;

            default:
                break;
        }
    }
}
