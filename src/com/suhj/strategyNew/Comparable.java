/**
 * 
 */
package com.suhj.strategyNew;

/**
 * @author Haojie
 * 定义一个泛型接口
 */
public interface Comparable<T> {
	/**
	 * 比较方法
	 * @param o 与哪个对象进行比较
	 * @return 小于比较对象返回 -1；大于比较对象返回 1；等于比较对象返回 0
	 */
	public abstract int compareTo(T o);
}
