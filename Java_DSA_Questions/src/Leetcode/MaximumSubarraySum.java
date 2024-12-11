package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class MaximumSubarraySum {

	public static long maximumSubarraySum(int[] nums, int k) {
        if(nums.length<k) return 0;
        int max=0;
        Set<Integer> set=new HashSet<>();
        int sum=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
           if(!set.contains(nums[i])){
            sum+=nums[i];
            set.add(nums[i]);
            if(i-j+1==k){
                max=Math.max(sum,max);
                sum-=nums[j];
                set.remove(nums[j]);
                j++;
            }
            
           }else{
            while(nums[j]!=nums[i]){
                sum-=nums[j];
                set.remove(nums[j]);
                j++;
            }
            j++;
           }
        }
      return max;
    }
	public static void main(String[] args) {
		int[] nums = {1,5,4,2,9,9,9};
		int k = 3;
		System.out.println(maximumSubarraySum(nums, k));
	}
}
