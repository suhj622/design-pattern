package com.suhj.singleton;

/**
 * 
 * @author Haojie
 *
 * 测试类
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if (obj1 == obj2) {
			System.out.println("obj1 与 obj2 是相同的实例。");
		}else {
			System.out.println("obj1 与 obj2 不是相同的实例。");
		}
		System.out.println("End.");
	}

}
