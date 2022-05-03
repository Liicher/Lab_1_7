package com.company.javabean;

// Интерфейс для добавления/удаления/оповещения наблюдателя
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
