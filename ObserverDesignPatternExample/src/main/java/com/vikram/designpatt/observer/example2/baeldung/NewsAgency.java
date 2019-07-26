package com.vikram.designpatt.observer.example2.baeldung;

import java.util.ArrayList;
import java.util.List;

//Observable object
public class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<Channel>();
 
    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }
 
    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }
 
    public void setNews(String news) {
        this.news = news;
        //Informing all observables about the change in news
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }
}
