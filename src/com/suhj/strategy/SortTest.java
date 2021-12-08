/**
 * 
 */
package com.suhj.strategy;

import java.util.Arrays;

/**
 * @author Haojie
 *
 * ≈≈–Ú∆˜≤‚ ‘¿‡
 */
public class SortTest {
	public static void main(String[] args) {
		Cat[] cats = {new Cat(2,4),new Cat(1,1),new Cat(3,1)};
		Dog[] dogs = {new Dog(3), new Dog(2), new Dog(8)};
		Sorter.sort(cats);
		Sorter.sort(dogs);
		System.out.println(Arrays.toString(cats));
		System.out.println(Arrays.toString(dogs));
	}

}
