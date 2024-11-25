package Java_Questions;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr= {-1,0,1,2,-1,-4};
		threeSum(arr);
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumList=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum=-1;
                    if(i!=j && i!=k && j!=k)
                        sum=nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        List<Integer> l=new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        threeSumList.add(l);
                    }
                }
            }
        }
        return threeSumList;
    }
}
