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
		Comparator Comparator1 = new CatHeightComparator();
		Comparator Comparator2 = new CatWeightComparator();
		Comparator Comparator3 = new DogFoodAmountComparator();
		
		//”√±»Ωœ∆˜≈≈–Ú
		Sorter.sort(cats, Comparator1);
		System.out.println(Arrays.toString(cats));
		Sorter.sort(cats, Comparator2);
		System.out.println(Arrays.toString(cats));
		Sorter.sort(dogs, Comparator3);
		System.out.println(Arrays.toString(dogs));
	}

}
