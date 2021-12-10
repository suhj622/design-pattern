/**
 * 
 */
package com.suhj.strategyNew;

/**
 * @author Haojie
 * 
 */
public class Cat implements Comparable<Cat> {
	
	private int weight, height;
	
	
	
	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;
	}

	public Cat(int weight,int height) {
		this.weight = weight;
		this.height = height;
	}

	@Override
	public int compareTo(Cat o) {
		if(this.weight < o.weight) return -1;
		else if (this.weight > o.weight) return 1;
		else return 0;
	}

	@Override
	public String toString() {
		return "Cat [weight=" + weight + ", height=" + height + "]";
	}
		

}
