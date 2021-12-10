/**
 * 
 */
package com.suhj.singletonNew;

/**
 * @author Haojie
 * 
 * 与 Mgr01 类似，只不过对象的初始化放到静态语句块里
 */
public class Mgr02 {
	
	private static final Mgr02 INSTANCE;
	
	//静态语句块初始化
	static {
		INSTANCE = new Mgr02();
	}
	
	private Mgr02() {};
	
	public static Mgr02 getInstance() {
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		Mgr01 m1 = Mgr01.getInstance();
		Mgr01 m2 = Mgr01.getInstance();
		System.out.println(m1 == m2);
	}

}
