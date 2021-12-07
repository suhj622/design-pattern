/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 *
 * 表示猜拳游戏中的策略的类
 */
public class Hand {
	public static final int HANDVALUE_GUU = 0;  //表示石头的值
	public static final int HANDVALUE_CHO = 1;  //表示剪刀的值
	public static final int HANDVALUE_PAA = 2;  //表示布的值
	//表示猜拳中 3 种手势的实例
	public static final Hand[] hands = {
			new Hand(HANDVALUE_GUU),
			new Hand(HANDVALUE_CHO),
			new Hand(HANDVALUE_PAA)
	};
	//表示猜拳中手势所对应的字符串
	private static final String[] names = {
			"石头", "剪刀", "布"
	};
	//猜拳中出的手势的值
	private int handValue;
	public Hand(int handValue) {
		this.handValue = handValue;
	}
	//根据手势的值获取其对应的实例
	public static Hand getHand(int handValue) {
		return hands[handValue];
	}
	//如果 this 胜了 h 则返回 true
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}
	//如果 this 输给了 h 则返回 true
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}	
	//计分：平 0，胜 1，负 -1 
	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handValue + 1) % 3 == h.handValue) {
			return 1;
		} else {
			return -1;
		}
	}
	//转换为手势值所对应的字符串
	@Override
	public String toString() {
		return names[handValue];
	}
	
}
