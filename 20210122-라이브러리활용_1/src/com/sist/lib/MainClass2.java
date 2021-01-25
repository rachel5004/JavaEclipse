package com.sist.lib;

public class MainClass2 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] arr1 = arr;
		
		System.out.println("arr1="+arr1);
		System.out.println("arr="+arr);    // 주소값 동일
		
		arr1[0] = 100;
		System.out.println(arr[0]);
		
		int[] arr2 = arr.clone();
		arr2[1] = 1000;
		System.out.println("arr[1]="+arr[1]);
		System.out.println("arr2="+arr2);
		
	}

}
