package Java_Questions;

public class MinNumKConsecutive {
	
	public static void main(String[] args) {
		int[] nums= {0,0,0,1,0,1,1,0};
		int k=3;
		minKBitFlips(nums, k);
	}
	
	public static int minKBitFlips(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int j=-1;
            int index=i;
           if(nums[i]==0){
            j=i;
            
            int count=1;
            while(k!=count){
            	index++;
                count++;
            }
            if(index>=nums.length){
                return -1;
            }else{
                ans++;
            }
            while(j>=0 &&j<=index){
                if(nums[j]==0)nums[j]=1;
                else nums[j]=0;
                j++;
            }

           }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return -1;
        }
        return ans;
    }

}
