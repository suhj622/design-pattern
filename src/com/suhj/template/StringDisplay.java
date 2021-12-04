/**
 * 
 */
package com.suhj.template;

/**
 * @author Haojie
 * 用指定的字符串类展现
 * 继承了抽象类 AbstractDisplay
 */
public class StringDisplay extends AbstractDisplay {
	
	private String string;
	private int width;
	
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	/*
	 * 重写了方法 open
	 */
	@Override
	public void open() {
		printLine();
	}

	/*
	 * 打印出边框
	 */
	private void printLine() {
		System.out.print("+");
		for(int i = 0;i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

	/*
	 * 重写了方法 print
	 */
	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	/*
	 * 重写了方法 close
	 */
	@Override
	public void close() {
		printLine();
	}

}
