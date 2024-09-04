package Lec_2;

import java.util.Arrays;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,10,8,2,0,6,1,6,1,7,8};
		int target=9;
		System.out.println("Array Before Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("Array after sorting");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
//		int a[]= twoSum(arr,target);
//		System.out.println(a[0]+" "+a[1]);

	}
	public static int[] twoSum(int arr[],int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]+arr[j]==target) {
					int a[]= {i,j};
					return a;
				}
			}
		}
		return new int[2];
		
	}

}
