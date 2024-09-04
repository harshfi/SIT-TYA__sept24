package Lec_2;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner h= new Scanner(System.in);
		int arr[]= new int [5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=h.nextInt();
		}
		
		int sum= Sum(arr);
		int min =Min(arr);
		System.out.println(min);

	}
	public static int Min(int a[]) {
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(min>a[i])min=a[i];
		}
		return min;
		
	}
	public static int Sum(int a[]) {
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}

}
