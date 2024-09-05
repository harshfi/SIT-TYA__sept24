package Lec_3;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{4,2,1,6,8,7},
				   {3,6,4,1,2,0},
				   {4,4,1,2,0,-1}};
		a= transpose(a);
		print(a);

	}
	
	public static int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int a[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[j][i]=matrix[i][j];
            }
        }
        return a;
        
    }
	
	public static void print(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
