/**
 * 
 */
package leetcode.array;

/**
 * @author sanket
 *
 */
public class RemoveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]input= {0,1,2,2,3,0,4,2};
		int out=removeElement(input, 2);
		System.out.println("Length:"+out);
		for (int i : input) {
			System.out.print(i+" ");
		}
	}

	public static int removeElement(int[] nums, int val) {
		if(nums.length==0){
            return nums.length;
        }
		int lenght= nums.length-1;
		while(true) {
			boolean flag = false;
			for (int i = 0; i < nums.length; i++) {
				if(i>lenght) {
					break;
				}
				if(nums[i]==val) {
					flag = true;
					nums[i]=nums[lenght];
					lenght--;
				}

			}
			if(!flag) {
				break;
			}
		}

		return lenght+1;
	}

}
