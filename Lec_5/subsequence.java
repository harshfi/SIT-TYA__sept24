package Lec_5;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seq("abc","",0);

	}
	public static void seq(String s, String ans, int i) {
		//base case
		if(s.length()==i) {
			System.out.println(ans);
			return;
		}
		//include
		seq(s,ans+s.charAt(i),i+1);
		
		//exclude
		seq(s,ans,i+1);
	}

}
