/**
 * 
 */
package com.suhj.strategy;

import java.util.Random;

/**
 * @author Haojie
 *
 * ��ʾ ��������һ�ֵ����ƴӸ����ϼ������һ�ֵ����ƣ���֮ǰ�Ĳ�ȭ���������һ�ֳ�����ȭ�ĸ��ʡ� ��һ���Ե���
 */
public class ProbStrategy implements Strategy {
	private Random random;
	private int preHandValue = 0;
	private int currentHandValue = 0;
	private int[][] history = {
			{ 1, 1, 1},
			{ 1, 1, 1},
			{ 1, 1, 1},
	};
	public ProbStrategy(int seed) {
		random = new Random(seed);
	}	
	@Override
	public Hand nextHand() {
		//ͳ�� hand[��һ�ֳ�������][��һ������������] ����ʤ����������һ�����ڡ�0-��ʤ����֮��������
		int bet = random.nextInt(getSum(currentHandValue));
		//��ȭ���Ʋ���Ϊ 0-ʯͷ
		int handvalue = 0;
		//���ɶ�Ӧ�Ĳ�ȭ����
		if (bet < history[currentHandValue][0]) {
			handvalue = 0;
		} else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
			handvalue = 1;
		} else {
			handvalue = 2;
		}
		//������ʷ��ȭ���Ƶĸ���
		////������һ�ֵ����� preHandValue
		preHandValue = currentHandValue;
		////������һ�ֵ�����
		currentHandValue = handvalue;
		//���ز�ȭ���ƶ���
		return Hand.getHand(handvalue);
	}
	private int getSum(int hv) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += history[hv][i];
		}
		return sum;
	}
	@Override
	public void study(boolean win) {
		if (win) {
			history[preHandValue][currentHandValue] ++;
		} else {
			history[preHandValue][(currentHandValue + 1) % 3] ++;
			history[preHandValue][(currentHandValue + 2) % 3] ++;
		}
	}

}
