package com.xq.lite.sort.insertion;

import java.util.Arrays;

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
			System.out.println("i="+i+" index= "+Arrays.toString(a));
			int j;
			for (j = i-1; j > 0; j--) {
				if(a[j] < a[i]){
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					System.out.println("i="+i+" index= "+Arrays.toString(a));
					break;
				}
			}
		}
	}

}
