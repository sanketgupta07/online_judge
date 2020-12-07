/**
 Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 */
package leetcode.array;

/**
 * @author sanket
 *
 */
public class MergeSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num1= {1,2,3,0,0,0,0};
		int[] num2= {0,2,5,6,0};
		merge(num1, 3,num2, 4 );
		for (int i : num1) {
			System.out.println(i+" ");
		}

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int[]t=new int[m+n];
		int n1=0;
		int n2=0;
		for (int i = 0; i < t.length; i++) {
			if(n1==m) {
				t[i]=nums2[n2++];
				continue;
			}
			if(n2==n) {
				t[i]=nums1[n1++];
				continue;
			}
			if(nums1[n1]<nums2[n2]) {
				t[i]=nums1[n1++];
			}else {
				t[i]=nums2[n2++];
			}
				
		}
		for (int i = 0; i < t.length; i++) {
			nums1[i]=t[i];
		}

	}

}
