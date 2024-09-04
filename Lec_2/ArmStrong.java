package Lec_2;
import java.util.*;
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner h= new Scanner (System.in);
		int n=h.nextInt();
		int temp =n;
		int temp1=n;//153
		
		int cnt=0;
		
		while(n>0) {
			cnt++;
			n=n/10;
		}
		
		int sum=0;
		while(temp>0) {
			int d=temp%10;
			sum=sum+(int)Math.pow(d, cnt); 
			//d^cnt
			temp=temp/10;
		}
		
		if(temp1==sum)System.out.println("Yes");
		else System.out.println("No");

	}

}
