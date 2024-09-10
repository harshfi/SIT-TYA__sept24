package Lec_6;

public class Lexi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=9;i++) {
			find(i,121);
		}

	}
	public static void find(int n,int range) {
		if(n> range) return;
		System.out.print(n+" ");
		n=n*10;
		
		for(int i=0;i<=9;i++) {
			find(n+i,range);
		}
	}

}
