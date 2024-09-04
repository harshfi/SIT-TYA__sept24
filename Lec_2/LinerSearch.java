package Lec_2;

public class LinerSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5, 7};
		System.out.println(find(arr,7));

	}
	static int find(int arr[],int t) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==t) return i;
		}
		return -1;
		
	}

}
