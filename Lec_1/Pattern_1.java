package Lec_1;

/*
 Pattern ->
        * 
      * * 
    * * * 
  * * * * 
* * * * * 

 */

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("*"+" " );
				j++;
			}

			// next row
			row++;
			System.out.println();
			star++;
			space--;
		}

	}

}