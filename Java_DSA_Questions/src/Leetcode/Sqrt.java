package Leetcode;

public class Sqrt {
	
	public static void main(String[] args) {
		int n=8;
		System.out.println(getSqrt(n));
	}
	
	public static int getSqrt(int n) {
		double s=0,e=n;
		double mid =(double)s +((double)e-(double)s)/2;
		while(mid*mid!=n) {
			if(mid*mid>n) {
				e=mid;
			}else if(mid*mid<n) {
				s=mid;
			}else {
				return (int)mid;
			}
			mid =(double)s +((double)e-(double)s)/2;
		}
		return (int)mid;
	}

}
