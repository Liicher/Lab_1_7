package com.company.javabean;

public class Process {

    public Process()
    {
        int key = Generate.getArrKey();     // Переменная с типом массива

        // Запуск обоих оброботчиков того или иного типа данных
        if (key == 1) {
            ProcessInt_1 P1 = new ProcessInt_1();
            ProcessInt_2 P2 = new ProcessInt_2();

            P1.process(Generate.getN(), Generate.getArray_int());
            P2.process(Generate.getN(), Generate.getArray_int());
        }
        else {
            ProcessString_1 P1 = new ProcessString_1();
            ProcessString_2 P2 = new ProcessString_2();

            P1.process(Generate.getN(), Generate.getArray_Str());
            P2.process(Generate.getN(), Generate.getArray_Str());
        }
    }
}
