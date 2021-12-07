/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 * 
 * ��ʾ���в�ȭ��Ϸ��ѡ�ֵ���
 */
public class Player {
	private String name;
	private Strategy strategy;
	private int wincount;
	private int losecount;
	private int gamecount;
	//���������Ͳ���
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}
	//���Ծ�����һ��Ҫ��������
	public Hand nextHand() {
		return strategy.nextHand();
	}
	//ʤ
	public void win() {
		strategy.study(true);
		wincount++;
		gamecount++;
	}
	//��
	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}
	//ƽ
	public void even() {
		gamecount++;
	}
	@Override
	public String toString() {
		return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
	}
	

}
