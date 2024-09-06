package Lec_4;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		for (int i = 0; i <=10; i++) {
			System.out.println(n1+n2);
			int t=n2;
			n2=n2+n1;
			n1=t;
		}

	}

}
