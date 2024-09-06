package Lec_4;

public class First_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,1,1,5,1,7,1,7,7,7,8};
		System.out.println(find(a,0,3));
	}
	public static int find(int a[],int idx,int t) {
		
		if(idx>=a.length) return -1;
		if(a[idx]==t) return idx;
		int i=find(a,idx+1,t);
		 return i;
	}

}
