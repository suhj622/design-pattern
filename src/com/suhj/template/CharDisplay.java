package com.suhj.template;

/**
 * ��ָ�����ַ���չ��
 * CharDisplay �̳��� AbstractDisplay
 * @author Haojie
 *
 */
public class CharDisplay extends AbstractDisplay {
	
	private char ch; //��Ҫ��ʾ���ַ�
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}
    
	/*
	 * ��д����ķ��� open
	 */
	@Override
	public void open() {
		System.out.print("<<");
	}
    
	/*
	 * ��д����ķ��� print
	 */
	@Override
	public void print() {
		System.out.print(ch);
	}

	/*
	 * ��д����ķ��� close
	 */
	@Override
	public void close() {
		System.out.println(">>");
	}

}
