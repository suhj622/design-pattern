package com.suhj.observer.v9;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Haojie
 * awtÖÐµÄobserver
 */

class Button {
	
	private List<ActionListener> actionListeners = new ArrayList<ActionListener>();
	
	public void buttonPressed() {		
		ActionEvent e = new ActionEvent(System.currentTimeMillis(), this);
		for(int i = 0; i < actionListeners.size(); i++) {
			ActionListener l = actionListeners.get(i);
			l.actionPerformed(e);
		}
	}
	
	public void addActionListener(ActionListener l) { actionListeners.add(l); }
}

interface ActionListener {
	public void actionPerformed(ActionEvent e);
}

class MyActionListener implements ActionListener {//Observer
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("button pressed!");			
	}		
}

class MyActionListener2 implements ActionListener {//Observer2
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("button pressed 2!");			
	}		
}

class ActionEvent {
	
	long when;
	Object source;
	
	public ActionEvent(long when, Object source) {
		super();
		this.when = when;
		this.source = source;
	}
	
	
	public long getWhen() {
		return when;
	}

	public Object getSource() {
		return source;
	}
}

public class TestFrame2 extends Frame {
		
	public static void main(String[] args) {
		Button b = new Button();
		b.addActionListener(new MyActionListener());
		b.addActionListener(new MyActionListener2());
		b.buttonPressed();
	}
	
	

}
