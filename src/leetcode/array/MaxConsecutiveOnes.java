/**
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 *  The maximum number of consecutive 1s is 3.
 */
package leetcode.array;

/**
 * @author sanket
 *
 */
public class MaxConsecutiveOnes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input[]= {1,1,0,1,1,1};
		int output;
		output = findMaxConsecutiveOnes(input);
		System.out.println(output);
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max=0;
		int currentCount=0;
		for(int num:nums) {			
			if(num==1) {
				currentCount++;
			}else {
				currentCount=0;
			}
			if(currentCount>max) {
				max=currentCount;
			}
		}
		return max;
	}

}
