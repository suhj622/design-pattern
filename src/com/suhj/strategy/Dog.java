/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 *
 */
public class Dog implements Comparable<Dog> {
	
	private int foodAmount;
	
	public Dog(int foodAmount) {
		this.foodAmount = foodAmount;
	}

	@Override
	public int compareTo(Dog o) {
		if(this.foodAmount < o.foodAmount) return -1;
		else if(this.foodAmount > o.foodAmount) return 1;
		else return 0;
	}

	@Override
	public String toString() {
		return "Dog [foodAmount=" + foodAmount + "]";
	}
	
	

}
