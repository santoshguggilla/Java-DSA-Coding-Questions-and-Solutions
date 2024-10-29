package Java_Questions;

public class ArithmeticSubsequence {
	
	public static void main(String[] args) {
		int[] a=new int[] {2,4,6,8,10};
		numberOfArithmeticSlices(a);
	}

	public static int numberOfArithmeticSlices(int[] nums) {
		if (nums.length < 3)
			return 0;
		return dif(nums, 0, 0, 1, 2);
	}

	public static int dif(int[] a, int count, int i, int j, int k) {
		if (i >= a.length)
			return count;
		if (k >= a.length) {
			if (j >= a.length && j + 1 >= a.length) {
				return count;
			} else {
				j++;
				k = j + 1;
				return dif(a, count, i, j, k);
			}
		}
		if (a[i] - a[j] == a[j] - a[k]) {
			
				count++;
				k++;
				return dif(a, count, i, j, k);

		} else {
			i++;
			j = i + 1;
			k = j + 1;
			
			return dif(a, count, i, j, k);
		}
	}
}
