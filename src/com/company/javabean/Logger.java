package com.company.javabean;

public class Logger implements Observer
{
    private String processName;
    private String name;
    // 1 - Обработчик целых 1
    // 2 - Обработчик целых 2
    // 3 - Обработчик строк 1
    // 4 - Обработчик строк 2

    public Logger(String name, Observable o) {
        this.name = name;
        o.addObserver(this);
    }

    @Override
    public void update(String content) {
        System.out.println(name + " выполнил задачу: " + content);
    }
}
