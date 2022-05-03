package com.company.javabean;

/*
Второй обработчик подсчитывает количество слов в каждой
строке, общее количество слов и символов по всем строкам списка
*/

public class ProcessString_2 implements ProcessString, Runnable {
    private static int[] WordsCountStr;     // Массив для количества слов в каждой строке
    private static int WordsCountAll;       // Количество слов во всех строках
    private static int[] SymbolCountStr;    // Массив для количества символов в каждой строке
    private static int SymbolCountAll;      // Количество символов во всех строках

    String[] Array;     // Сгенерированный массив
    int N;              // Объем данных

    public ProcessString_2() {
        this.Array = Generate.getArray_Str();
        this.N = Generate.getN();
    }

    public void process(int N, String[] Array_Str) {
        var processObserverStr2 = new ProcessObserver();
        new Logger("Обработчик строк №2", processObserverStr2);

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

        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i < Array_Str.length; i++) {
            sb1.append("Количество  слов  в  " + (i+1) + " строке:  " + WordsCountStr[i] +
                    "\nКоличество символов в " + (i+1) + " строке: " + SymbolCountStr[i] + "\n");
        }
        sb1.append("Общее  количество  слов:   " + WordsCountAll +
                "\nОбщее количество символов: " + SymbolCountAll);
        processObserverStr2.setContent("\n" + sb1);
    }

    public static int[] getWordsCountStr() { return WordsCountStr; }
    public static int getWordsCountAll() { return WordsCountAll; }
    public static int[] getSymbolCountStr() { return SymbolCountStr; }
    public static int getSymbolCountAll() { return SymbolCountAll; }

    @Override
    public void run() {
        process(Generate.getN(), Generate.getArray_Str());
    }
}