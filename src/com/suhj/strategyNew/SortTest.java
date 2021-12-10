/**
 * 
 */
package com.suhj.strategyNew;

import java.util.Arrays;

/**
 * @author Haojie
 *
 * ������������-ʹ��Lambda���ʽ
 */
public class SortTest {
	public static void main(String[] args) {
		
		Cat[] cats = {new Cat(2,4),new Cat(1,1),new Cat(3,1)};
		//Dog[] dogs = {new Dog(3), new Dog(2), new Dog(8)};
		//Comparator<Cat> Comparator1 = new CatHeightComparator();
		//Comparator<Cat> Comparator2 = new CatWeightComparator();
		//Comparator<Dog> Comparator3 = new DogFoodAmountComparator();
		
		//�ñȽ�������
		Sorter<Cat> catSorter = new Sorter<Cat>();
		//Sorter<Dog> dogSorter = new Sorter<Dog>();
		
		//�ߵ���ǰ��
		catSorter.sort(cats, (o1,o2)->{
			if(o1.getHeight() < o2.getHeight()) return 1;
			else if (o1.getHeight() > o2.getHeight()) return -1;
			else return 0;
		});
		System.out.println(Arrays.toString(cats));
		//catSorter.sort(cats, Comparator2);
		//System.out.println(Arrays.toString(cats));
		//dogSorter.sort(dogs, Comparator3);
		//System.out.println(Arrays.toString(dogs));
	}

}
