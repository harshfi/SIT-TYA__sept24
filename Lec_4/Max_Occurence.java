package Lec_4;

public class Max_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "absabmaaabbcs";
		int a[]= new int[26];
		
		
		for (int i = 0; i < s.length(); i++) {
			int idx= (int)(s.charAt(i)-'a');
			
			a[idx]++;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println((char)(i+'a')+" -> "+ a[i]);
		}

	}

}
