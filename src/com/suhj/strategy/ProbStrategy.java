/**
 * 
 */
package com.suhj.strategy;

import java.util.Random;

/**
 * @author Haojie
 *
 * 表示 “根据上一局的手势从概率上计算出下一局的手势，从之前的猜拳结果计算下一局出各种拳的概率” 这一策略的类
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
		//统计 hand[上一局出的手势][这一局所出的手势] 的总胜数，并生成一个落在【0-总胜数】之间的随机数
		int bet = random.nextInt(getSum(currentHandValue));
		//冲拳手势策略为 0-石头
		int handvalue = 0;
		//生成对应的猜拳策略
		if (bet < history[currentHandValue][0]) {
			handvalue = 0;
		} else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
			handvalue = 1;
		} else {
			handvalue = 2;
		}
		//进行历史猜拳手势的更新
		////更新上一局的手势 preHandValue
		preHandValue = currentHandValue;
		////更新这一局的手势
		currentHandValue = handvalue;
		//返回猜拳手势对象
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
