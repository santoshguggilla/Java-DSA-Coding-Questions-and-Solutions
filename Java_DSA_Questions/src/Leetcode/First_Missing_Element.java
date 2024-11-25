package Leetcode;

public class First_Missing_Element {

	public static void main(String[] args) {
		
		int[] a= {1,3,-2,6,4,5};
		/*
		boolean[] b=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]>0 && a[i]<=a.length) {
				b[a[i]-1]=true;
			}
		}
		for(int i=0;i<b.length;i++) {
			if(!b[i]) {
				System.out.println(i+1);
				return;
			}
		}
		System.out.println("All Exists");
		*/
		firstMissingPositive(a);
	}
	 public static int firstMissingPositive(int[] nums) {
	        boolean[] b=new boolean[nums.length+1];
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]>0 || nums[i]<=nums.length){
	                b[nums[i]]=true;
	            }
	        }
	        for(int i=1;i<b.length;i++){
	            if(!b[i]) return i;
	        }
	        return 0;
	    }
	
}
