package com.vikram.designpatt.adapter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
      
        if(bugattiVeyronAdapter.getSpeed() ==431.30312) {
        	System.out.println(" speed has been converted to MPH from KPH");
        }
    }
}
