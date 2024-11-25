package Leetcode;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(nums);
	}
	
	public static int removeDuplicates(int[] nums) {
        int count=0;
        int i=0,j=1;
        while(i<nums.length && j<nums.length){
          
           while(i!=j && i<nums.length && j<nums.length && nums[i]==nums[j]){
            
            count++;
            j++;
           }
           i++;
           if(i<nums.length && j<nums.length)nums[i]=nums[j];
           
        }
        return count;
    }
}
