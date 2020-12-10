/**
 * 
 */
package leetcode.array;

/**
 * @author sanket
 *
 */
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]input= {0,0,0,1,1,1,2,2,3,3,4};
		int out=removeDuplicates(input);
		System.out.println("Length:"+out);
		for (int i : input) {
			System.out.print(i+" ");
		}

	}

	public static int removeDuplicates(int[] nums) {
		if(nums.length==0){
			return nums.length;
		}
		int j=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[j]!=nums[i]) {
				j++;
				nums[j]=nums[i];
			}
		}
		return j+1;
	}

}
