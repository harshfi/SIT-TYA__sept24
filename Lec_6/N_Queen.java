package Lec_6;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=4;
         int board[][]= new int[n][n];
         
        Queen(0,board);
	}
	public static void Queen(int row,int board[][]) {
		//basecase
		if(row==board.length) {
			print(board);
			System.out.println();
			System.out.println();
			return;
		}
		
		for(int i=0;i<board[0].length;i++) {
			
			if(isSafe(row,i,board)==true) {
				board[row][i]=1;
				Queen(row+1,board);
				board[row][i]=0;
			}
		}
	}
	public static boolean isSafe(int row,int col,int board[][]) {
		//left dia
		int r=row;
		int c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]==1) return false;
			r--;
			c--;
		}
		//right dia
		r=row;
	    c=col;
	    while(r>=0 && c<board.length) {
	    	if(board[r][c]==1) return false;
			r--;
			c++;
	    }
	    
	    //vertical
	    r=row;
	    while(r>=0) {
	    	if(board[r][col]==1) return false;
			r--;
	    }
	    return true;
	}
	public static void print(int board[][]) {
		for(int i=0;i<board.length;i++) {
			for (int j = 0; j < board.length; j++) {
				
				if(board[i][j]==1)System.out.print("Q ");
				else System.out.print("_ ");
			}
			System.out.println();
		}
	}

}
