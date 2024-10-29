package Java_Questions;

public class KSumPairs {

	public static void main(String[] args) {
		int[] n=new int[] {1,2,3,4};
		int k=5;
		System.out.println(getKSumPairs(n, k));
	}

	public static int getKSumPairs(int[] nums, int k) {
		int n = nums.length;
		int count = 0;
		boolean[] a = new boolean[n];
		for (int i = 0; i < n; i++) {
			int sum = nums[i];
			if (!a[i]) {
				for (int j = i + 1; j < n; j++) {
					if (sum + nums[j] == k && !a[i] && !a[j]) {
						a[i] = true;
						a[j] = true;
						count++;
					}
				}
			}
		}

		return count;
	}

}
