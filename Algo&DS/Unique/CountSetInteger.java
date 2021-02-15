/*
 * Count the number of set bits in an Integer.
 */
public class CountSetBits {

	public static void main(String[] args) {
		//Approach 1 use library function.
        int x = 16;
        System.out.println(Integer.bitCount(x));

        //Approach 2 use right shift operator
        int count = 0;
        while(x>0) {    
    	   if ((x & 1) == 1) {
    		   count++;
    	   }
    	   x=x>>1; //you can also write x/=2;
        }
        System.out.println(count);
        /*
         * The direction to which the arrow points is the direction in which the arrow moves.
         */
	}

}