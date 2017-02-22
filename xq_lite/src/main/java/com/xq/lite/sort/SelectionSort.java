package com.xq.lite.sort;

import java.util.Arrays;

import com.xq.lite.until.SortUntil;

public class SelectionSort {
	
	private static int[] a ={7, 2, 9, 5, 3};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slectionSort(a);
		//selectionSort2(a);
	}
	
	public static void slectionSort(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.println("i="+i+" "+Arrays.toString(a));
			int bigger = 0;
			//选取最大值
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[bigger] < a[j]){
					bigger = j;
				}
			}
			System.out.println("---"+a[bigger]);
			if(bigger != a.length-i){
				SortUntil.swap(a, bigger, a.length-1-i);
			}
		}
	}
	
	public static void selectionSort2(int[] arr){
		for (int i = 0; i < a.length; i++) {
			System.out.println("i="+i+" "+Arrays.toString(a));
			int s = i;
			//选取最小值
			for (int j = s; j < a.length; j++) {
				if(a[s] > a[j]){
					s = j;
				}
			}
			System.out.println("---"+a[s]);
			if(s != i){
				SortUntil.swap(a, s, i);
			}
		}
	}
	
}
