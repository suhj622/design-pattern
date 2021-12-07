/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 * 
 * ��ʾ��ȭ��Ϸ�еĲ��ԵĽӿ�
 */
public interface Strategy {
	/**
	 * ��ȡ��һ��Ҫ��������
	 * @return
	 */
	public abstract Hand nextHand();
	/**
	 * ѧϰ ����һ�ֵ������Ƿ��ʤ�ˡ�
	 * �������һ���е��� nextHand ������ȡ�ˣ��ͽ��ŵ��� study(true)
	 * ������ˣ��ͽ��ŵ��� study(false)
	 * ������Strategy �ӿڵ�ʵ����ͻ�ı��Լ����ڲ�״̬���Ӷ�Ϊ��һ�� nextHand ������ʱ�Ƿ��� ��ʯͷ�� �������� ���� ������ �ṩ�ж�����
	 * @param win
	 */
	public abstract void study(boolean win);
}
