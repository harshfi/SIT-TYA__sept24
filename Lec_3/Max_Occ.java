package Lec_3;

public class Max_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aaabbbbcccddddeeeeeefffffggghhhkkkkkkk";
		char ans=' ';
		int max=0;
		for (int i = 0; i < s.length(); ) {
			int j=i;
			int cnt=0;
			while(j<s.length()&& s.charAt(i)==s.charAt(j)) {
				j++;
				cnt++;
			}
			if(cnt>max) {
				max=cnt;
				ans=s.charAt(i);
			}
			i=j;
			
		}
		
		System.out.println(ans+" "+max);

	}

}
