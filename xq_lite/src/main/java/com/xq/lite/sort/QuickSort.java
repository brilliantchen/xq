package com.xq.lite.sort;

import java.util.Arrays;

public class QuickSort {
	
	private static int[] a ={17, 32, 19, 25, 43, 35, 76, 53};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(a, 0, a.length-1);
	}
	
	private static void quickSort(int[] a, int low, int high){
		if(low >= high) return;
		int pivot = partition(a, low, high);
		quickSort(a, low, pivot-1);
		quickSort(a, pivot+1, high);
	}

	private static int partition(int[] a, int low, int high){
		int pivotValue = a[low];
		while(low < high){
			System.out.println("--------------------------");
			//从后面扫
			while(a[high] >= pivotValue && high > low){
				high--;
			}
			System.out.println(Arrays.toString(a));
			a[low] = a[high];
			System.out.println(Arrays.toString(a));
			while(a[low] <= pivotValue && high > low){
				low++;
			}
			System.out.println("----------");
			System.out.println(Arrays.toString(a));
			a[high] = a[low];
			System.out.println(Arrays.toString(a));
		}
		a[low] = pivotValue;
		System.out.println(low+"|"+high);
		return high;
	}
}
