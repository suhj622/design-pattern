/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 * 
 * 排序器，对一个数组进行排序
 */
public class Sorter {
	
	/**
	 * 冒泡排序
	 * @param arr
	 */
	public static void sort(Comparable[] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			int minPos = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				minPos = arr[j].compareTo(arr[minPos])== -1 ? j : minPos;
			}
			swap(arr, i, minPos);
		}
	}
	
	private static void swap(Comparable[] arr, int i, int j) {
		Comparable temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
