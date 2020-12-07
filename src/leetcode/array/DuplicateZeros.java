/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place, do not return anything from your function. 
 **/
package leetcode.array;

/**
 * @author sanket
 *
 */
public class DuplicateZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input[]= {0,0,0};
		duplicateZeros(input);
		for (int i : input) {
			System.out.print(i+" ");
		}

	}

	public static void duplicateZeros1(int[] arr) {
		for (int i = 0; i < arr.length;i++ ) {
			if(arr[i]==0 && i<arr.length-1) {
				for (int j = arr.length -1 ; j > i; j--) {
					arr[j]=arr[j-1];
				}
				arr[++i]=0;
			}
		}
	}

	public static void duplicateZeros(int[] arr) {
		int []t= new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length;i++ ) {
			if(j<arr.length)
				t[j]=arr[i];
			if(arr[i]==0)
				j++;
			j++;
		}
		for (int i = 0; i < t.length; i++) {
			arr[i]=t[i];
		}
	}
}
