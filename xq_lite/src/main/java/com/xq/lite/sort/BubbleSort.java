package com.xq.lite.sort;

import java.util.Arrays;

import com.xq.lite.until.SortUntil;

public class BubbleSort {
	
	private static int[] a ={7, 2, 9, 5, 3};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubbleSort(a);

	}
	
	public static void bubbleSort(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.println("i="+i+" "+Arrays.toString(a));
			for (int j = 0; j < a.length -i -1; j++) {
				System.out.println("i="+i+" j="+j+" "+Arrays.toString(a));
				if(a[j] > a[j+1]){
					SortUntil.swap(a, j, j+1);
					System.out.println("i="+i+" j="+j+" "+Arrays.toString(a));
				}
			}
		}
	}

}
