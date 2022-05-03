package com.company.javabean;

import java.util.ArrayList;
import java.util.List;

public class ProcessObserver implements Observable {
    private List<Observer> processes;
    private String content;

    public ProcessObserver()
    {
        processes = new ArrayList<>();
    }

    public void setContent(String processContent) {
        this.content = processContent;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        processes.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        processes.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : processes)
            o.update(content);
    }
}
