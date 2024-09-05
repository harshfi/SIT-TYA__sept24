package Lec_3;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="harsh";
		System.out.println(isPal(s));

	}
	public static boolean isPal(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}
