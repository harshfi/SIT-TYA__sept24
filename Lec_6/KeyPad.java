package Lec_6;

public class KeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String keypad[]= {"","","abc","def","ghi","jkl",
				            "mno","pqrs","tuv","wxyz"};  //2-9
		
		   find("",0,"23",keypad);
		}
	
	 public static void find(String ans,int idx,String d,String [] keypad) {
		 
		 //base case
		 if(idx==d.length()) {
			 
			 System.out.println(ans);
			 return;
		 }
		 int digit= d.charAt(idx)-'0';
		 String s= keypad[digit];
		 
		 for(int i=0;i<s.length();i++) {
			 find(ans+s.charAt(i),idx+1,d,keypad);
		 }
		 
	 }
	
	

	}


