package com.vikram.designpatt.observer.example3.baeldung;

public class Main {
	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();
		
		NewsChannel channel1 = new NewsChannel();
		NewsChannel channel2 = new NewsChannel();
		
		newsAgency.addObserver(channel1);
		newsAgency.addObserver(channel2);
		
		newsAgency.setNews("This is breaking news " );
		
		System.out.println(channel1.getNews());
		System.out.println(channel2.getNews());
	}
}
