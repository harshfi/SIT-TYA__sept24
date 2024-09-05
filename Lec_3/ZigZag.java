package Lec_3;

import java.util.Scanner;

public class ZigZag {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner h = new Scanner(System.in);
		
		int arr[][]= new int [3][3];
		//row
		for (int i = 0; i < arr.length; i++) {
			//col 
			//kaif ka jo ith array hain usko access krrega
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=h.nextInt();
			}
			
		}
		print(arr);
		System.out.println();
		System.out.println();
		ZigZag(arr);

	}
	public static void ZigZag(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			
			if(i%2==0) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j]+" ");
				}
			}
			else {
				for (int j = a[i].length-1; j >=0; j--) {
					System.out.print(a[i][j]+" ");
				}
			}
//			System.out.println();
		}
	}
	public static void print(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
