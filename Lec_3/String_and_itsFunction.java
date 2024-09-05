package Lec_3;

public class String_and_itsFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first="Harsh";
		String last=" Tripathi";
		String fullname= first+last;
//		System.out.println(fullname);
		
		//character access CharAt(i);
		System.out.println(first.charAt(2));
		
		//substring(start,end+1);
		System.out.println(first.substring(1,4));
		
		
		//substring(start)
		System.out.println(first.substring(1));
		//size of the String
		System.out.println(first.length());
		
		//Split
		String s="im a good boy";
		String[] Ss=s.split(" ");
	   
		for (int i = 0; i < Ss.length; i++) {
			System.out.println(Ss[i]);
		}
		
		//String to char=> toCharArray
		
		char fA[]=first.toCharArray();
		
		for (int i = 0; i < fA.length; i++) {
			System.out.println(fA[i]);
		}
		

	}

}
