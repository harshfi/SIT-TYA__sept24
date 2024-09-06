package Lec_4;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Harsh";
		String rev="";
		
//		for (int i =s.length()-1 ; i >=0 ; i--) {
//			
//			rev=rev+s.charAt(i);
//		}
		
		for (int i = 0; i < s.length(); i++) {
			rev= s.charAt(i)+rev;
		}
		
		System.out.println(rev);

	}

}
