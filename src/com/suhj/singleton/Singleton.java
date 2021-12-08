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
	//private 保证其他类无法访问
	private static final Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("生成了一个实例。");
	}
	public static Singleton getInstance() {
		return singleton;
	}

}
