package com.xq.lite.sort.insertion;

import java.util.Arrays;

import com.xq.lite.until.SortUntil;

public class StraightInsertionSort {
	
	private static int[] a ={7, 2, 9, 5, 3};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort(a);
	}
	
	private static void insertionSort(int[] a){
		for (int i = 1; i < a.length; i++) {
			System.out.println("---------------------");
			System.out.println("i="+i+" "+Arrays.toString(a));
			int j;
			for (j = i; j > 0; j--) {
				if(a[j] < a[j-1]){
					SortUntil.swap(a, j, j-1);
					System.out.println("i="+i+" "+Arrays.toString(a));
				}else{
					break;
				}
			}
		}
	}
	
}
