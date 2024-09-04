package Lec_2;

public class ArmStrongRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100000;i++) {
			int n=i;
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
			
			
			if(temp1==sum)System.out.println(i);
			
		}

	}
	

}
