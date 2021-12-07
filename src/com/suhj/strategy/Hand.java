/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 *
 * ��ʾ��ȭ��Ϸ�еĲ��Ե���
 */
public class Hand {
	public static final int HANDVALUE_GUU = 0;  //��ʾʯͷ��ֵ
	public static final int HANDVALUE_CHO = 1;  //��ʾ������ֵ
	public static final int HANDVALUE_PAA = 2;  //��ʾ����ֵ
	//��ʾ��ȭ�� 3 �����Ƶ�ʵ��
	public static final Hand[] hands = {
			new Hand(HANDVALUE_GUU),
			new Hand(HANDVALUE_CHO),
			new Hand(HANDVALUE_PAA)
	};
	//��ʾ��ȭ����������Ӧ���ַ���
	private static final String[] names = {
			"ʯͷ", "����", "��"
	};
	//��ȭ�г������Ƶ�ֵ
	private int handValue;
	public Hand(int handValue) {
		this.handValue = handValue;
	}
	//�������Ƶ�ֵ��ȡ���Ӧ��ʵ��
	public static Hand getHand(int handValue) {
		return hands[handValue];
	}
	//��� this ʤ�� h �򷵻� true
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}
	//��� this ����� h �򷵻� true
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}	
	//�Ʒ֣�ƽ 0��ʤ 1���� -1 
	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handValue + 1) % 3 == h.handValue) {
			return 1;
		} else {
			return -1;
		}
	}
	//ת��Ϊ����ֵ����Ӧ���ַ���
	@Override
	public String toString() {
		return names[handValue];
	}
	
}
