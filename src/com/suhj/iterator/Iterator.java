package com.suhj.iterator;

/**
 * �������ϵĽӿ�
 * @author Haojie
 *
 */
public interface Iterator {
	
	/**
	 * �ж��Ƿ������һ��Ԫ�صķ���
	 * @return boolean
	 */
	public abstract boolean hasNext();
	
	/**
	 * ���ؼ����е���һ��Ԫ��
	 * �������������ƶ�����һ��Ԫ�صĴ���
	 * @return
	 */
	public abstract Object next();

}
