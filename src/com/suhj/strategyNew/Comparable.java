/**
 * 
 */
package com.suhj.strategyNew;

/**
 * @author Haojie
 * ����һ�����ͽӿ�
 */
public interface Comparable<T> {
	/**
	 * �ȽϷ���
	 * @param o ���ĸ�������бȽ�
	 * @return С�ڱȽ϶��󷵻� -1�����ڱȽ϶��󷵻� 1�����ڱȽ϶��󷵻� 0
	 */
	public abstract int compareTo(T o);
}
