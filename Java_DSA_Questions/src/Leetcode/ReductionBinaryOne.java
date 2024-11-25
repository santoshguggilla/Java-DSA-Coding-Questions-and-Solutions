package Leetcode;

public class ReductionBinaryOne {

	public static void main(String[] args) {
		String s="1111011110000011100000110001011011110010111001010111110001";
		numSteps(s);
	}
	
	 public static int numSteps(String s) {
	        int n=0,k=0;
	        for(int i=s.length()-1;i>=0;i--){
	            int v=s.charAt(i)-'0';
	            n+=Math.pow(2,k++)*v;
	        }
	        int count=0;
	        while(n!=0 && n!=1){
	            if(n%2==1){
	                count++;
	                n+=1;
	            }
	            count++;
	            n/=2;
	        }
	        return count;
	    }
}
