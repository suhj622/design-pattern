/**
 * 
 */
package com.suhj.observer.v8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Haojie 
 * �ܶ�ʱ�򣬹۲�����Ҫ�����¼��ľ�����������д���
 * �����ʱ�����Ǵ����¼���ʱ�������¼�Դ����
 * �¼�Ҳ�����γɼ̳���ϵ
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

//�¼��� fire Event
class WakeUpEvent extends Event<Child> {
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
