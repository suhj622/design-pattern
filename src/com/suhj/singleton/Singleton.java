/**
 * 
 */
package com.suhj.singleton;

/**
 * @author Haojie
 * 
 * ����ģʽ-����ʽ
 */
public class Singleton {
	//private ��֤�������޷�����
	private static final Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("������һ��ʵ����");
	}
	public static Singleton getInstance() {
		return singleton;
	}

}
