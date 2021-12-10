/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 * 比较器接口
 */
public interface Comparator<T> {
	public abstract int compare(T o1, T o2);
}
