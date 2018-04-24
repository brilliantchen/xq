package com.xq.lite.algorithm;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 二分查找
 */
public class BinarySearch {

  private static int[] a ={1, 8, 19, 25, 33, 35, 41, 42, 54, 55, 59, 60, 66, 69, 77, 88, 99};
  public static int v = 25;

  /**
   * @param args
   */
  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    int index = iterBiSearch(0, a.length-1);
    System.out.println(index);
    if(index > 0)
      System.out.println(a[index]);
  }

  public static int iterBiSearch(int beg, int end){
    if(end <= beg){
      return  -1;
    }
    int mid = (beg + end) /2;
    if(a[mid] == v){
      return mid;
    } else if(a[mid] > v){
      return iterBiSearch(beg, mid-1);
    }else if(a[mid] < v){
      return iterBiSearch(mid+1, end);
    }
    return  -1;
  }


}
