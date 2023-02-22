package com.ojas.demo;

public class Demo {

public static void pairDifference(int []arr,int target) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] == target||arr[i] - arr[j] == target)
					System.out.println("The Pair is :" + arr[i] + " " + arr[j]);
			}
		}
	}
public static void add(int a,int b){
int c =a+b;
System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 2, 4, 8 };
		 int target=3;
		 pairDifference(arr, target);
                 add(12,34);
	}
}
