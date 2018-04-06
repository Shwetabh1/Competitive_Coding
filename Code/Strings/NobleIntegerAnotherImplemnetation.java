/*
 * Given an array arr[], find a Noble integer in it. 
 * An integer x is said to be Noble in arr[] if the number of integers greater than x are equal to x. 
 * If there are many Noble integers, return any of them. If there is no, then return -1.
 * Implementation using Sorting
 * I have also uploaded another implementation using TreeSet. Do check it out.
 */
import java.util.Arrays;

public class NobleIntegerAnotherImplementation {

	public static void main(String[] args) {
		int arr[] = {-1, -2, -3, 0, 0, 0,1 };
		Arrays.sort(arr);
		int siz = arr.length;
		int i = 0;
		boolean ans = false;
		for (; i<siz; i++) {
			if (i<siz-1 && arr[i] == arr[i+1])
				continue;
			if (arr[i] == siz-i-1) {
				ans = true;
				break;
			}
		}
		if (ans || arr[siz-1] == 0) {
			System.out.println(arr[i]);
		} else {
			System.out.println("Ain't No Answer");
		}
	}
}