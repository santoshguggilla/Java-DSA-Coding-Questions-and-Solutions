package Leetcode;

import java.util.Arrays;

public class MinimumDifficultyJobSchedule {
	public static int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        if(d>n) return -1;
        
        Arrays.sort(jobDifficulty);
        for (int i = 0; i < n / 2; i++) {
            int temp = jobDifficulty[i];
            jobDifficulty[i] = jobDifficulty[n- 1 - i];
            jobDifficulty[n - 1 - i] = temp;
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n-d;i++){
            if(max<=jobDifficulty[i]){
                max=jobDifficulty[i];
            }
        }
        int sum=0;
        for(int i=n-d+1;i<n;i++){
            sum+=jobDifficulty[i];
        }
        return sum+max;
    }
	public static void main(String[] args) {
		int[] a=new int[] {11,111,22,222,33,333,44,444};
		minDifficulty(a, 6);
	}
}
