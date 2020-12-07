/**
 * 
 */
package leetcode.array;

import java.util.Arrays;

/**
 * @author sanket
 *
 */
public class SquareOfSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input[]= {-7,-3,2,3,11};
		int[] output;
		output = SqrOfSortedArray1(input);
		for (int i : output) {
			System.out.print(i+" ");
		}
		

	}

	private static int[] SqrOfSortedArray(int[] nums) {
		int [] o = Arrays.stream(nums).map(i->i*i).toArray();
		Arrays.sort(o);
		return o;
	}
	
	private static int[] SqrOfSortedArray1(int[] o) {
//		int[]o= new int[nums.length];
		for (int i = 0; i < o.length; i++) 
			o[i] = o[i]*o[i];
		for (int i = 0; i < o.length; i++) {
			for (int j = i+1; j < o.length; j++) {
				if(o[i]>o[j]) {
					int temp = o[i];
					o[i]=o[j];
					o[j]=temp;
				}
			}
		}
		System.gc();
		return o;
	}

}
