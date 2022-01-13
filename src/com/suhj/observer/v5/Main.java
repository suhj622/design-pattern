/**
 * 
 */
package com.suhj.observer.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Haojie
 * 分离观察者与被观察者
 */

class Child {
	private boolean cry = false;
	private List<Observer> observers = new ArrayList<>();
	
	{
		observers.add(new Dad());
		observers.add(new Mum());
		observers.add(new Dog());
	}
	
	public boolean isCry() {
		return cry;
	}
	
	public void wakeUp() {
		cry = true;
		for(Observer o : observers) {
			o.actionOnWakeUp();
		}
	}
}

class Dad implements Observer {

	public void feed() {
		System.out.println("dad feeding...");
	}
	
	@Override
	public void actionOnWakeUp() {
		feed();
		
	}
	
}

class Mum implements Observer {
	
	public void hug(){
		System.out.println("mum hugging...");
	}

	@Override
	public void actionOnWakeUp() {
		hug();		
	}	
}

class Dog implements Observer {
	
	public void wang() {
		System.out.println("dog wang....");
	}	

	@Override
	public void actionOnWakeUp() {
		wang();		
	}	
}

interface Observer {
	void actionOnWakeUp();
}

public class Main {

	public static void main(String[] args) {
		Child child = new Child();
		//do sth
		child.wakeUp();
	}
	
	

}
