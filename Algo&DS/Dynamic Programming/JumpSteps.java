import java.util.Arrays;

/*
 * Given an array of non-zero integers reach the end with minimum number of steps with atmost number of steps from i = a[i]
 * If a[i] equals 0 it can't move.
 * Also Look at minimum-steps-to-reach-end.js for same solution in NodeJS
 */

public class JumpSteps {

	public static void main(String[] args) {
		int arr[] = {9, 1, 2, 3, 4, 5};
		int len = arr.length;
		int auxiliaryArray[] = new int [len];
		Arrays.fill(auxiliaryArray, Integer.MAX_VALUE);
		auxiliaryArray[0] = 0;
		
		for (int i=1;i<len;i++) {
			for (int j=0;j<i;j++) {
				if (i-j <= arr[j] && auxiliaryArray[j] + 1 < auxiliaryArray[i] ) {
					auxiliaryArray[i] = auxiliaryArray[j] + 1;
				}
			}
		}
		
		System.out.println(auxiliaryArray[len-1]);

	}

}
