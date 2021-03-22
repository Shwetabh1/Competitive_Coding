/*
 * Print in the following form
 *  INPUT: 4 
	4 4 4 4 4 4 4 
	4 3 3 3 3 3 4 
	4 3 2 2 2 3 4 
	4 3 2 1 2 3 4 
	4 3 2 2 2 3 4 
	4 3 3 3 3 3 4 
	4 4 4 4 4 4 4

    INPUT: 3
	3 3 3 3 3 
	3 2 2 2 3 
	3 2 1 2 3 
	3 2 2 2 3 
	3 3 3 3 3
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Pretty_Print_Matrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		ArrayList<ArrayList<Integer>> at = new ArrayList<ArrayList<Integer>>(2*n-1); 
        //initialize each array
		for (int l=0;l<2 * n - 1;l++) {
        	at.add(new ArrayList<Integer>(2*n-1));
        	for (int j=0;j<2*n-1;j++) {
        		at.get(l).add(0);
        	}
        }
        
        int cnt = 2 * n - 1;
       
		for (Integer i=n,k=0;i>1;i--,k++) {
			for (Integer j = k;j< cnt;j++) {
                 at.get(k).set(j, i);
                 at.get(j).set(cnt-1, i);
                 at.get(cnt-1).set(j, i);
                 at.get(j).set(k,i);
			}
			cnt--;
		}
		at.get(n-1).set(n-1, 1);
		
		//Print the ArrayList
		for (int i=0;i<at.size();i++) {
			for (int j=0;j<at.get(i).size();j++){
				System.out.print(at.get(i).get(j) + " ");
			}
			System.out.println("");
		}

		in.close();

	}

}