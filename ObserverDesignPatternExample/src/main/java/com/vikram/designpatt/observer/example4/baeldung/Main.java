package com.vikram.designpatt.observer.example4.baeldung;

public class Main {
	public static void main(String[] args) {
		PCLNewsAgency newsAgency = new PCLNewsAgency();
		
		PCLNewsChannel channel1 = new PCLNewsChannel();
		PCLNewsChannel channel2 = new PCLNewsChannel();
		
		newsAgency.addPropertyChangeListener(channel1);
		newsAgency.addPropertyChangeListener(channel2);
		
		newsAgency.setNews("This is breaking news " );
		
		System.out.println(channel1.getNews());
		System.out.println(channel2.getNews());
	}
}
