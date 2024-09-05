package Lec_3;

public class CountNegBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(countNegatives(a));

	}
	public static  int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
          int RowCount= grid[i].length-rowBinary(grid,i);//count of neg
          count=count+RowCount;
          
        }
        return count;
    }

    public static int rowBinary(int [][]grid, int row){
       
    	int s=0;
    	int e=grid[row].length-1;
    	
    	int ans=0;
    	while(s<=e) {
    		int mid=(s+e)/2;
    		if(grid[row][mid]<0) {
    			ans=mid;
    			e=mid-1;
    		}
    		else s=mid+1;
    	}
    	return ans;
    }

}
