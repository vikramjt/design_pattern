package com.vikram.designpatt.observer.example3.baeldung;

import java.util.Observable;
import java.util.Observer;

//Observer object
public class NewsChannel implements Observer {
    private String news;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	@Override
	public void update(Observable o, Object news) {
		this.setNews((String) news);
	} 
}