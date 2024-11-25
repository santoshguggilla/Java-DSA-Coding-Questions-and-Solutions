package Leetcode;

public class SumSquareNum {
	
	public static void main(String[] args) {
		judgeSquareSum(2147483600);
	}
	
	public static boolean judgeSquareSum(int c) {
       long i=0,j=(long)Math.sqrt(c)+1;
        while(i<=j){
            long m=i*i+j*j;
            if(m<c){
                i++;
            }else if(m>c){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }

}
