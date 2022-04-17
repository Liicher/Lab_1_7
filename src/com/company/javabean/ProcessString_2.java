package com.company.javabean;

/*
Второй обработчик подсчитывает количество слов в каждой
строке, общее количество слов и символов по всем строкам списка
*/

import com.ibm.jvm.Log;

public class ProcessString_2 implements ProcessString
{
    private static int[] WordsCountStr;     // Массив для количества слов в каждой строке
    private static int WordsCountAll;       // Количество слов во всех строках
    private static int[] SymbolCountStr;    // Массив для количества символов в каждой строке
    private static int SymbolCountAll;      // Количество символов во всех строках

    String[] Array;     // Сгенерированный массив
    int N;              // Объем данных

    public ProcessString_2()    // Конструктор
    {
        this.Array = Generate.getArray_Str();
        this.N = Generate.getN();
    }

    public void process(int N, String[] Array_Str)
    {
        SymbolCountStr = new int[Array_Str.length];
        SymbolCountAll = 0;
        WordsCountAll = 0;
        WordsCountStr = new int[Array_Str.length];

        // Подсчет слов и символов
        for (int i = 0; i < Array_Str.length; i++) {
            for (int j = 0; j < Array_Str[i].length(); j++) {
                SymbolCountAll++;
                SymbolCountStr[i]++;
            }

            String[] w = Array_Str[i].split(" ");
            for (int j = 0; j < w.length; j++) {
                WordsCountAll++;
                WordsCountStr[i]++;
            }
        }

        Logger logger = new Logger();
        logger.getContent(4);       // Логгер для второго обработчика строк
    }

    public static int[] getWordsCountStr() { return WordsCountStr; }
    public static int getWordsCountAll() { return WordsCountAll; }
    public static int[] getSymbolCountStr() { return SymbolCountStr; }
    public static int getSymbolCountAll() { return SymbolCountAll; }
}