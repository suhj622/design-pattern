/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 * 
 * 排序器，对一个数组进行排序
 */
public class Sorter<T> {
	
	/**
	 * 插入排序
	 * 用 Comparable 接口实现的版本
	 * @param arr
	 */
//	public static void sort(Comparable[] arr) {
//		for(int i = 0; i < arr.length -1; i++) {
//			int minPos = i;
//			
//			for(int j = i + 1; j < arr.length; j++) {
//				minPos = arr[j].compareTo(arr[minPos])== -1 ? j : minPos;
//			}
//			swap(arr, i, minPos);
//		}
//	}
	
	/**
	 * 插入排序
	 * 用比较器实现的版本
	 * @param arr
	 */
	public void sort(T[] arr, Comparator<T> comparator) {
		for(int i = 0; i < arr.length -1; i++) {
			int minPos = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
			}
			swap(arr, i, minPos);
		}
	}	
	
	private void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
