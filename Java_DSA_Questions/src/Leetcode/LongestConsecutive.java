package Leetcode;

public class LongestConsecutive {
	
	public static void main(String[] args) {
		int[] nums= {100,4,200,1,3,2};
		longestConsecutive(nums);
	}
	
	 public static int longestConsecutive(int[] nums) {
	        boolean[] b=new boolean[nums.length];
	        int max=0;
	        b[0]=true;
	        for(int i=0;i<nums.length;i++){
	            int count=0;
	           int j=0;
	           int temp=nums[i];
	           while(j<nums.length){                    
	                if(temp+1==nums[j] ){
	                    count++;
	                     
	                    temp=nums[j];
	                    j=0;
	                }else j++;
	            }
	            if(max<count){
	                max=count;
	            }
	        }
	        return max;
	    }
}
