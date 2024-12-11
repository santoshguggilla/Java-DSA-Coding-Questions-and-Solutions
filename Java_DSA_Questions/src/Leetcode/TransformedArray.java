package Leetcode;

public class TransformedArray {

	public static int[] constructTransformedArray(int[] nums) {
        int[] ans=new int[nums.length];
       for(int i=0;i<nums.length;i++){
           int temp=i;
           int val=nums[i];
           if(val<0){
        	   val=Math.abs(val);
               while(val!=0){
                   temp--;
                   val--;
                   if(temp<0){
                       temp=nums.length-1;
                   }
               }
               ans[i]=nums[temp];
           }else{
              
               while(val!=0){
                   temp++;
                   val--;
                   if(temp==nums.length){
                       temp=0;
                   }
               }
               ans[i]=nums[temp];
           }
           
       }
       return ans;
   }
	public static void main(String[] args) {
		int[] nums = {3,-2,1,1};
		System.out.println(constructTransformedArray(nums));
	}
}
