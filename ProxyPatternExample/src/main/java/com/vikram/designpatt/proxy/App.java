package com.vikram.designpatt.proxy;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
	    ExpensiveObject object = new ExpensiveObjectProxy();
	    object.process();
	    object.process();
	}
}
