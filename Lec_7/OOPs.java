package Lec_7;
import java.util.*;
public class OOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combination comb= new Combination(); 
//		comb.find(4,2,new ArrayList<>(),1);
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,5));
		
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b,int c) {
		return a+b+c;
	}

}
