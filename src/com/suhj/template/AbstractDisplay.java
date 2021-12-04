package com.suhj.template;

/**
 * ������ AbstractDisplay
 * @author Haojie
 *
 */
public abstract class AbstractDisplay {
	
	/*
	 * ��������ȥʵ�ֵĳ��󷽷� open
	 */
	public abstract void open();
	
	/*
	 * ��������ȥʵ�ֵĳ��󷽷� print
	 */
	public abstract void print();
	
	/*
	 * ��������ȥʵ�ֵĳ��󷽷� close
	 */
	public abstract void close();
	
	/*
	 * ��������ʵ�ֵ� display ����
	 */
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
	
}
