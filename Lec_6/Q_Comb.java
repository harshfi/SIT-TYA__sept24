package Lec_6;

public class Q_Comb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int visited[]= new int[4];   
	  path(4,2,visited,"");
	}
	
	public static void path(int n,int q, int visited[],String ans) {
		if(q==0) {
			System.out.println(ans);
			return ;
		}
		
		for(int i=0;i<n;i++) {
			if(visited[i]!=1) {
				visited[i]=1;
				path(n,q-1,visited,ans+" Q"+q+" d"+i);
				visited[i]=0; //backtraking
				
			}
		}
	}
	

}
