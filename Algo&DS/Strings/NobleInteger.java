/*
 * Given an array arr[], find a Noble integer in it. 
 * An integer x is said to be Noble in arr[] if the number of integers greater than x are equal to x. 
 * If there are many Noble integers, return any of them. If there is no, then return -1.
 * Implementation using TreeMap
 */
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class NobleInteger {

	public static void main(String[] args) {
		int arr[] = { 4, -9, 8, 5, -1, 7, 5, 3 };
		
		TreeMap<Integer,Integer> tl = 
				new TreeMap<Integer,Integer>(new Comparator<Integer>()
				{
					public int compare(Integer x, Integer y) {
						if (x < y) {return 1;} 
								else if (x>y) {return -1 ;}
								else {return 0;}
					}
				});
		
		for (int i:arr) {
			tl.put(i,1);
		}

		int i = 0;
		
		for (int t : tl.keySet()) {
			System.out.print(t + "  ");
			if (t == i++) {
				System.out.println("Noble Integer" + t);
				break;
			}
		}

	}

}
