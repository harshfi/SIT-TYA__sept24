package Lec_3;

import java.util.Arrays;

public class Sort2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{4,2,1,6,8,7},
				   {3,6,4,1,2,0},
				   {4,4,1,2,0,-1}};
		//if 2d array have N row then it must have N+1 1-D array
		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a[i]);
		}
		 print(a);
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
