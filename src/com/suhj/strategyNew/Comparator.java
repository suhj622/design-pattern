/**
 * 
 */
package com.suhj.strategyNew;

/**
 * @author Haojie
 * 比较器接口
 */
public interface Comparator<T> {
	public abstract int compare(T o1, T o2);
	
	default void m() {
		System.out.println("m");
	}
}
