/**
 * 
 */
package com.suhj.factory;

/**
 * @author Haojie
 *
 * ������
 * 
 */
public class Main {

	/**
	 * ������� main ����
	 * @param args
	 */
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("С��");
		Product card2 = factory.create("С��");
		Product card3 = factory.create("С��");
		card1.use();
		card2.use();
		card3.use();
	}

}