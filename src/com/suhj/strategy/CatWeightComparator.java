/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 * è���رȽ���
 */
public class CatWeightComparator implements Comparator<Cat> {
	@Override
	public int comparator(Cat o1, Cat o2) {
	    if(o1.getHeight() < o2.getHeight()) return -1;
	    else if(o1.getHeight() > o2.getHeight()) return 1;
	    else return 0;
	}
}
