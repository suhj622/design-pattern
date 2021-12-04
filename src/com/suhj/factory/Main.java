/**
 * 
 */
package com.suhj.factory;

/**
 * @author Haojie
 *
 * 测试类
 * 
 */
public class Main {

	/**
	 * 工程入口 main 方法
	 * @param args
	 */
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("小明");
		Product card2 = factory.create("小红");
		Product card3 = factory.create("小刚");
		card1.use();
		card2.use();
		card3.use();
	}

}
