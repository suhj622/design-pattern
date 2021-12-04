package com.suhj.template;

/**
 * 
 * @author Haojie
 * 
 * 测试类
 */
public class Main {

	public static void main(String[] args) {
		//生成一个持有 'H' 的 CharDisplay 类的实例
		AbstractDisplay d1 = new CharDisplay('H');
		//生成一个持有 "Hello, world." 的 StringDisplay 类的实例
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		//生成一个持有 "你好，世界。" 的 StringDisplay 类的实例
		AbstractDisplay d3 = new StringDisplay("你好，世界。");
		
		d1.display();
		d2.display();
		d3.display();
	}

}
