package Lec_5;

public class Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =path(2,2,0,0,"");
		System.out.println(count);

	}
	public static int path(int dr,int dc, int cr,int cc,String ans) {
		//base case
		if(cr==dr && cc==dc) {
			System.out.println(ans);
			return 1;
		}
		//out of bounder
		if(cr>dr || cc> dc) {
			return 0;
		}
		//H
		int h=path(dr,dc,cr,cc+1,ans+"H");
		//V
	   int v=path(dr,dc,cr+1,cc,ans+"V");
	   return h+v;
		
	}

}
