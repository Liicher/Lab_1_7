package com.company.javabean;

public class Logger implements ILogger
{
    // 1 - Обработчик целых 1
    // 2 - Обработчик целых 2
    // 3 - Обработчик строк 1
    // 4 - Обработчик строк 2

    public Logger() { }

    @Override
    public void getContent(int LKey) {

        switch (LKey)
        {
            case 1:
                System.out.println("Сумма = " + ProcessInt_1.getSum() +
                        "\nМинимальное значение = " + ProcessInt_1.getMin() +
                        "\nМаксимальное значение = " + ProcessInt_1.getMax() +
                        "\nСреднее значение = " + ProcessInt_1.getAverage());
                System.out.println();
                break;

            case 2:
                int[] ArrayInt = ProcessInt_2.getArray_2();
                System.out.println("Новый массив: ");
                for(int i = 0; i < ProcessInt_2.getCount(); i++) {
                    System.out.print(ArrayInt[i] + " ");
                }
                System.out.println();
                break;

            case 3:
                System.out.println("'Склеенные' строки: ");
                String[] ArrayStr_1 = ProcessString_1.getArray_2();
                for(int i = 0; i < Generate.getN(); i++) {
                    System.out.println(ArrayStr_1[i]);
                }
                System.out.println();
                break;

            case 4:
                String[] ArrayStr_2 = Generate.getArray_Str();
                int[] StringWords = ProcessString_2.getWordsCountStr();
                int[] StringSymbols = ProcessString_2.getSymbolCountStr();
                for (int i = 0; i < ArrayStr_2.length; i++) {
                    System.out.println("Количество  слов  в  " + (i+1) + " строке:  " + StringWords[i] +
                            "\nКоличество символов в " + (i+1) + " строке: " + StringSymbols[i]);
                }
                System.out.println("Общее  количество  слов:   " + ProcessString_2.getWordsCountAll() +
                        "\nОбщее количество символов: " + ProcessString_2.getSymbolCountAll());
                System.out.println();
                break;
        }
    }
}
