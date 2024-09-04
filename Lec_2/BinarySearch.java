package Lec_2;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,5,8,10,11,24,34,67};
		int temp=1;
		int t=2;
		int start=0;
		int end = a.length-1;//index
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]== t) {
				temp=0;
				System.out.println("found at "+mid);
				break;
			}
			else if(a[mid]>t)end=mid-1;
			else start=mid+1;
		}
		if(temp==1)System.out.println("Not found");

	}

}
