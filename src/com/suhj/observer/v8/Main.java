/**
 * 
 */
package com.suhj.observer.v8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Haojie 
 * 很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，徐亚事件源对象
 * 事件也可以形成继承体系
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
		WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);
		for(Observer o : observers) {
			o.actionOnWakeUp(event);
		}
	}
}

abstract class Event<T> {
	abstract T getSource();
}

//事件类 fire Event
class WakeUpEvent extends Event {
	long timestamp;
	String loc;
	Child source;
	
	public WakeUpEvent(long timestamp, String loc, Child source) {
		this.timestamp = timestamp;
		this.loc = loc;
		this.source = source;
	}

	@Override
	public Child getSource() {
		return source;
	}
	
}

class Dad implements Observer {

	public void feed() {
		System.out.println("dad feeding...");
	}
	
	@Override
	public void actionOnWakeUp(WakeUpEvent e) {
		feed();
		
	}
	
}

class Mum implements Observer {
	
	public void hug(){
		System.out.println("mum hugging...");
	}

	@Override
	public void actionOnWakeUp(WakeUpEvent e) {
		hug();		
	}	
}

class Dog implements Observer {
	
	public void wang() {
		System.out.println("dog wang....");
	}	

	@Override
	public void actionOnWakeUp(WakeUpEvent e) {
		wang();		
	}	
}

interface Observer {
	void actionOnWakeUp(WakeUpEvent e);
}

public class Main {

	public static void main(String[] args) {
		Child child = new Child();
		//do sth
		child.wakeUp();
	}
	
	

}
