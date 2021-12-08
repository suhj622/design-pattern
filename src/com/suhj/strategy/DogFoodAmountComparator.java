/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 * ¹··¹Á¿±È½ÏÆ÷
 */
public class DogFoodAmountComparator implements Comparator<Dog> {

	@Override
	public int comparator(Dog o1, Dog o2) {
		if(o1.getFoodAmount() < o2.getFoodAmount()) return -1;
		else if (o1.getFoodAmount() > o2.getFoodAmount()) return 1;
		else return 0;
	}


}
