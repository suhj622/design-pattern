/**
 * 
 */
package com.suhj.singleton;

/**
 * @author Haojie
 * 
 * 单例模式-饿汉式
 */
public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("生成了一个实例。");
	}
	public static Singleton getInstance() {
		return singleton;
	}

}
