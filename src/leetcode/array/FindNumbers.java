/**
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation: 
 * 12 contains 2 digits (even number of digits). 
 * 345 contains 3 digits (odd number of digits). 
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits). 
 * 7896 contains 4 digits (even number of digits). 
 * Therefore only 12 and 7896 contain an even number of digits.
 */
package leetcode.array;

public class FindNumbers {

	public static void main(String[] args) {
		int input[]= {12,345,2,6,7896,5261};
		int output;
		output = findNumbers2(input);
		System.out.println(output);

	}

	public static int findNumbers(int[] nums) {
		int numcount=0;
		for (int t:nums) {
			
			int digits=0;
			while (t>0) {
				t=t/10;
				digits++;
			}
			System.gc();
			if(digits%2==0)
				numcount++;
			
		}
		System.gc();
		return numcount;
	}
	
	public static int findNumbers1(int [] nums) {
		int count=0;
		for (int n : nums) {
            if (n > 9 && n < 100 || n > 999 && n < 10000 || n > 99999)
                count++;
        }
		System.gc();
        return count;
	}
	
	public static int findNumbers2(int [] nums) {
		int count=0;
		for (int n : nums) {
            if (String.valueOf(n).length()%2==0)
                count++;
        }
		System.gc();
        return count;
	}
}
