/*
 * Convert given Integer to Roman Numerals
 * Range 1-4000
 */

import java.util.Scanner;

public class RomanNumerals { //class name should always be a noun.

	public static String Roman(int i) { //method name should always be a verb.
		switch(i) {
		    case 1: return "I";
		    case 2: return "II";
		    case 3: return "III";
		    case 4: return "IV";
		    case 5: return "V";
		    case 9: return "IX";
		    case 10: return "X";
		    case 40: return "XL";
		    case 50: return "L";
		    case 90: return "XC";
		    case 100: return "C";
		    case 400: return "CD";
		    case 500: return "D";
		    case 900:return "CM";
		    case 1000: return "M";
		    default: return "";
		}
	}

	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String rom = "";
        while (num > 0) {
        	if (num/1000 > 0) {
        		int temp =  num/1000;
        		num %= 1000;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(1000));
        	} else if (num/900 > 0) {
        		int temp =  num/900;
        		num %= 900;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(900));
        	} else if (num/500 > 0) {
        		int temp =  num/500;
        		num %= 500;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(500));
        	} else if (num/400 > 0) {
        		int temp =  num/400;
        		num %= 400;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(400));
        	} else if (num/100 > 0) {
        		int temp =  num/100;
        		num %= 100;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(100));
        	} else if (num/90 > 0) {
        		int temp =  num/90;
        		num %= 90;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(90));
        	} else if (num/50 > 0) {
        		int temp =  num/50;
        		num %= 50;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(50));
        	} else if (num/40 > 0) {
        		int temp =  num/40;
        		num %= 40;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(40));
        	} else if (num/10 > 0) {
        		int temp =  num/10;
        		num %= 10;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(10));
        	} else if (num/9 > 0) {
        		int temp =  num/9;
        		num %= 9;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(9));
        	} else if (num/5 > 0) {
        		int temp =  num/5;
        		num %= 5;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(5));
        	} else if (num/4 > 0) {
        		int temp =  num/4;
        		num %= 4;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(4));
        	} else if (num/1 > 0) {
        		int temp =  num/1;
        		num %= 1;
        		for (int i=0;i<temp;i++)
        		rom = rom.concat(Roman(1));
        	}
        }
        in.close();
        System.out.println(rom);
	}

}
