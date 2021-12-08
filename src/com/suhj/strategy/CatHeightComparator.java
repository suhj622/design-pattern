/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 * 猫身高比较器
 */
public class CatHeightComparator implements Comparator<Cat> {
	@Override
	public int comparator(Cat o1, Cat o2) {
	    if(o1.getWeight() < o2.getWeight()) return -1;
	    else if(o1.getWeight() > o2.getWeight()) return 1;
	    else return 0;
	}
}
