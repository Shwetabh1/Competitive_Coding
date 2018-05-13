//A subsequence is a sequence that can be derived from another sequence, 
//by deleting some elements without changing the order of the remaining elements.
import java.util.Arrays;

public class LongestIncreasingSubsequence {
	
	public static void main(String[] argv) {
		int arr[] = {1,2,3,-1,-1,5,0,9};
		int len = arr.length;
		int auxArr[] = new int[len];
		Arrays.fill(auxArr, 1);
		for(int i=1;i<len;i++) {
			for (int j=0;j<i;j++) {
				if (arr[j] < arr[i] && auxArr[j]+1 > auxArr[i]) {
					auxArr[i] = auxArr[j] + 1;
				}
			}
		}	
		int ans = Integer.MIN_VALUE;
		//find max
		for (int k : auxArr) {
			if (k>ans) {
				ans = k;
			}
		}
		System.out.println(ans);
	}

}
