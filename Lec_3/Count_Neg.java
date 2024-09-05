package Lec_3;

public class Count_Neg {
	public static void main(String arg[]) {
		int a[][]= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(countL(a));
	}
	public static int countL(int a[][]) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				if(a[i][j]<0)count++;
			}
		}
		return count;
	}

}
