package Lec_7;
import java.util.*;
public class Combination {
	
	static List<List<Integer>> ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ans=new ArrayList<>();
		List<Integer> list= new ArrayList<>();
        find(4,2,list,1);
        System.out.println(ans);
	}
	public static void find(int n,int k,List<Integer> list, int s) {
		//basecase
		if(k==0) {
			ans.add(new ArrayList<>(list));
			return ;
		}
		
		for(int i=s;i<=n;i++) {
			list.add(i);
			find(n,k-1,list,i+1);
			list.remove(list.size()-1);
		}
	}

}
