package Lec_4;

public class Rev_Word_inString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Sky     is        blue    ";
		System.out.println(rev(s));

	}
	public static String  rev(String s) {
		String ans="";
		String arr[]=s.split("\\s+");
		for (int i = arr.length-1; i >=0; i--) {
			ans=ans+arr[i]+" ";
		}
		return ans.trim();
	}

}
