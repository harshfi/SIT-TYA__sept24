package Lec_3;
import java.util.*;
public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner h = new Scanner(System.in);
		
		int kaif[][]= new int [5][5];
		//row
		for (int i = 0; i < kaif.length; i++) {
			//col 
			//kaif ka jo ith array hain usko access krrega
			for (int j = 0; j < kaif[i].length; j++) {
				kaif[i][j]=h.nextInt();
			}
			
		}
		print(kaif);

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
