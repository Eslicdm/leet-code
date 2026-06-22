package com.eslirodrigues.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private String news;
    private List<Observer> observers = new ArrayList<>();

    public void setNews(String news) {
        this.news = news;
        System.out.println("NewsAgency: Publishing news -> " + news);
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}