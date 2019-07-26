package com.vikram.designpatt.observer.example2.baeldung;

//Observer object
public class NewsChannel implements Channel {
    private String news;
 
    @Override
    public void update(Object news) {
    	 this.setNews((String) news);
    }

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	} 
}