package Java_Questions;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,3,2,1,0};
		int count = 0, c = 0;
		while (count != a.length - 1) {
			int i = 0, j = 1;
			count = 0;
			while (i < a.length && j < a.length) {
				c++;
				if (a[i] <= a[j]) {
					count++;
				} else {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				i++;
				j++;
			}
		}
		System.out.println(Arrays.toString(a) + " Count:" + c);
	}

}
