package Lec_3;

public class FirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="harshatsit";
		String f="sit";
		for (int i = 0; i < s.length(); i++) {
			
			if(f.charAt(0)==s.charAt(i)) {
				if(check(f,s,i)==true)System.out.println(i);
			}
		}

	}
	public static boolean check(String f, String s,int idx) {
		
		for (int i = 0; i < f.length(); i++) {
			
			
			if(f.charAt(i)!=s.charAt(idx))
		         return false;
		         
		    idx++;
		}
	return true;
	}

}
