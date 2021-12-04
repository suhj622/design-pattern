package com.suhj.template;

/**
 * 用指定的字符来展现
 * CharDisplay 继承了 AbstractDisplay
 * @author Haojie
 *
 */
public class CharDisplay extends AbstractDisplay {
	
	private char ch; //需要显示的字符
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}
    
	/*
	 * 重写父类的方法 open
	 */
	@Override
	public void open() {
		System.out.print("<<");
	}
    
	/*
	 * 重写父类的方法 print
	 */
	@Override
	public void print() {
		System.out.print(ch);
	}

	/*
	 * 重写父类的方法 close
	 */
	@Override
	public void close() {
		System.out.println(">>");
	}

}
