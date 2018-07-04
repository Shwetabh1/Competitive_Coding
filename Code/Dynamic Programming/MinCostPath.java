/*
 * Given a matrix where you can only move left, right or diagonally down.
 * Move from position 0,0 to m,n with minimum cost 
 */
public class MinCostPath {
	
	public static int calcMinCost(int mat[][]) {
		int m = mat.length;
		int n = mat[0].length;
		//create an auxiliary cost matrix
		int costMat[][] = new int[m][n];
		costMat[0][0] = mat[0][0];
		//base cost
		for (int i=0;i<1;i++) {
			for (int j=1;j<n;j++) {
				costMat[i][j] = mat[i][j] + costMat[i][j-1];
				
			}
			for (int j=1;j<m;j++) {
				costMat[j][i] = mat[j][i] + costMat[j-1][i];
			}
		}
		//Build the Cost Matrix
		for (int i=1;i<m;i++) {
			for (int j=1;j<n;j++) {
				int left = costMat[i][j-1] + mat[i][j];
				int top = costMat[i-1][j] + mat[i][j];
				int diagonal = costMat[i-1][j-1] + mat[i][j];
				costMat[i][j] = (left < top) ? (left < diagonal ? left : diagonal) : (top < diagonal ? top : diagonal);
			}
		}
	  	/* Print the Cost Matrix
	    	for (int i=0;i<m;i++) {
				for (int j=0;j<n;j++) {
					System.out.print(costMat[i][j] + " ");
				}
				System.out.println("");
			}
	  	*/
		return costMat[m-1][n-1];
	}

	public static void main(String[] args) {
	     int testCase1[][] = {{1,2,3},
	              	  		  {4,8,2},
	              	  		  {1,5,7}};
	     int testCase2[][] = {{1,2,3,4},
     	  		  			  {1,1,1,1},
     	  		  			  {1,1,1,1}};
	     System.out.println("Total Cost->" + calcMinCost(testCase1));
	     System.out.println("Total Cost->" +calcMinCost(testCase2));
	}

}