package Lec_6;

import java.util.*;

public class combination_sum {
	static List<List<Integer>> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list= new ArrayList<>();
		int coins[]= {5,3,2};
		Arrays.sort(coins);
		
		List<Integer> l= new ArrayList<>();
		
		find(l,coins,8,0);
		System.out.println(list);

	}
	public static void find(List<Integer> ans,int coins[],int target,int idx) {
		//basecase
		if(target==0) {
			list.add(new ArrayList<>(ans));
			return ;
		}
		
		for(int i=idx;i<coins.length;i++) {
			if(target>= coins[i]) {
				ans.add(coins[i]);
				find(ans,coins,target-coins[i],i);
				ans.remove(ans.size()-1);
			}
		}
	}

}
