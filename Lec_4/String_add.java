package Lec_4;

public class String_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n1="59";
		String n2="1";
		int i=n1.length()-1,j=n2.length()-1;
		int c=0;
		String ans="";
		while(i>=0 && j>=0) {
			int d= (n1.charAt(i)-'0')+(n2.charAt(j)-'0')+c;
			ans=(d%10)+ans;
			c=d/10;
			i--;
			j--;
		}
		
		while(i>=0) {
			int d= (n1.charAt(i)-'0')+c;
			ans=(d%10)+ans;
			c=d/10;
			i--;
			
		}
		while(j>=0) {
			int d=(n2.charAt(j)-'0')+c;
			ans=(d%10)+ans;
			c=d/10;
			j--;
		}
		
		if(c>=1)ans=c+ans;
		System.out.println(ans);

	}

}
