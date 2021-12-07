package com.suhj.strategy;

import java.util.Random;

/**
 * 
 * @author Haojie
 *  
 * ��ʾ �������ֲ�ȭ��ʤ����ô��һ��Ҳ��һ�������ơ� ��һ���Ե���
 */
public class WinningStrategy implements Strategy {
	private Random random;
	private boolean won = false;
	private Hand preHand;
	public WinningStrategy(int seed) {
		random = new Random(seed);
	}
	@Override
	public Hand nextHand() {
		if (!won) {
			preHand = Hand.getHand(random.nextInt(3));
		}
		//System.out.print(preHand);
		return preHand;
	}
	@Override
	public void study(boolean win) {
		won = win;
	}
	//����
	public static void main(String[] args) {
		WinningStrategy strategy = new WinningStrategy(311);
		strategy.nextHand();
	}

}
