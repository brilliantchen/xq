package com.xq.lite.algorithm;

import java.util.Arrays;

/**
 * 斐波那契数列-兔子数列
 * 个数列从第三项开始，每一项都等于前两项之和 F(0)=0，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少
 */
public class FBNQ {

  public static void main(String[] args) {
    method1();
    method2();
    method3();
  }

  public static void method1(){
    int a = 1, b = 1, c = 0;
    for (int i = 0; i < 10; i++) {
      c =a+b;
      a = b;
      b =c;
      System.out.print(","+c);
    }
    System.out.println("");
  }

  public static void method2(){
    int arr[] = new int[10];
    arr[0] = arr[1] = 1;
    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i -1] + arr[i -2];
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void method3(){
    for (int i = 1; i < 10; i++) {
      System.out.print(","+getFibo(i));
    }
  }

  private static int getFibo(int i){
    if (i < 2){
      return 1;
    }
    return getFibo(i-2) + getFibo(i-1);
  }


}
