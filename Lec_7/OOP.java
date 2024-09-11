package Lec_7;

public class OOP {
	
	public static class student{
		int roll_no;
		String name;
		int c;
		
		public static void be() {
			System.out.println("Good boy/ girls");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		student s= new student();
		s.name="harsh";
		s.roll_no=1;
		s.c=3;
		student s1= new student();
		s1.name="arpit";
		s1.roll_no=2;
		s1.c=4;
		System.out.println(s.name+" "+s.c+" "+s.roll_no);
		System.out.println(s1.name+" "+s1.c+" "+s1.roll_no);
		
	}

}
