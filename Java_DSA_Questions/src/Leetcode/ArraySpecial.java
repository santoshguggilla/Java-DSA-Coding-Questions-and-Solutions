package Leetcode;

public class ArraySpecial {
	public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=queries.length;
        boolean[] ans=new boolean[n];
        for(int i=0;i<n;i++){
            int s=queries[i][0];
            int e=queries[i][1];
            boolean check=false;
            boolean isTog=false;
            boolean c=false;
            while(s<=e){
                if(s==queries[i][0]){
                     if(nums[s]%2==1){
                        check=false; 
                    }else{
                        check=true;
                    }
                    isTog=!check;
                }else if(nums[s]%2==1){
                    check=false; 
                }else{
                    check=true;
                }
                if(isTog==check){
                    c=true;
                    ans[i]=false;
                    break;
                }else{
                    isTog=check;
                }
                s++;
            }
            if(!c){
                ans[i]=true;
            }
        }
        return ans;
    } 
}
