package Lec_4;

public class String_vs_StrB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans="";
		StringBuilder sb= new StringBuilder();
		System.out.println("start");
		for (int i = 0; i < 500000; i++) {
			ans=ans+"a";
		}
		for (int i = 0; i < 500000; i++) {
			sb.append('a');
		}
		System.out.println(sb+" stop");

	}

}
