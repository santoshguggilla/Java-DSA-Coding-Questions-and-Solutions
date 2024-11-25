package Leetcode;

public class PrimeOddEvenAddition {
	public static void main(String[] args) {
		int[] a=new int[] {1,3,5,7,9,6,2,4,8,13,15,12,11};
		int prime=0;
		int odd=0;
		int even=0;
		for(int v:a) {
			int count=0;
			for(int i=2;i<=v;i++) {
				if(v%i==0) count++;
			}
			if(count>=2) {
				prime+=v;
			}
			if(v%2==0) {
				even+=v;
			}else {
				odd+=v;
			}
		}
		System.out.println("Prime : "+prime+" Odd : "+odd+" Even : "+even);
	}
}
