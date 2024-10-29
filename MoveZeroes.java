package Java_Questions;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int right=n-1;
        int count=0;
        for(int i=0;i<n;i++) {
        	if(nums[i]==0) count++;
        }
        int i=0;
        while(i<n){
            if( nums[i]==0  && count!=0){
                for(int j=i+1;j<n;j++){
                    nums[j-1]=nums[j];
                }
                nums[right--]=0;
                count--;
            }else {
            	i++;
            }
        }
    }
	public static void main(String[] args) {
		int[] a=new int[] {2,1};
		moveZeroes(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
