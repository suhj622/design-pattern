package com.suhj.strategy;

import java.util.Random;

/**
 * 
 * @author Haojie
 *  
 * 表示 “如果这局猜拳获胜，那么下一局也出一样的手势” 这一策略的类
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
	//测试
	public static void main(String[] args) {
		WinningStrategy strategy = new WinningStrategy(311);
		strategy.nextHand();
	}

}
