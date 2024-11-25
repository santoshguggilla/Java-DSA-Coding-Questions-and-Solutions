package Leetcode;

public class Skipping_Elements {
	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,5,6,7,8,9,10};
		int k=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			while(k!=count) {
				i++;
				count++;
			}
			if(i<a.length) {
				System.out.println(a[i]+".......");
			}
			k++;
			
		}
	}

}
