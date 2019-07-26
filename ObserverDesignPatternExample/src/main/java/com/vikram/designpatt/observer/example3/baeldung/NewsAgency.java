package com.vikram.designpatt.observer.example3.baeldung;

import java.util.Observable;

//Observable object
public class NewsAgency extends Observable{
    private String news;
 
    public void setNews(String news) {
        this.news = news;
        //Informing all observables about the change in news
        setChanged();
        notifyObservers(news);
    }
}
