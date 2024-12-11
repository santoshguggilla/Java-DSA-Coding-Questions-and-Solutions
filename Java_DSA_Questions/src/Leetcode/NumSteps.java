package Leetcode;

public class NumSteps {
	public static void main(String[] args) {
		String str=
				"1111011110000011100000110001011011110010111001010111110001";
		System.out.println(numSteps(str));
		System.out.println(numStepsCheck(str));
	}

	public static int numSteps(String s) {
        long n=0;
        int k=0;
        for(int i=s.length()-1;i>=0;i--){
            int v=s.charAt(i)-'0';
            n+=Math.pow(2,k++)*v;
        }
        int count=0;
        while(n!=0 && n!=1){
             if(n%2==1){
                n+=1;
            }
            count++;
            n/=2;
        }
        return count;
    }
	
	public static int numStepsCheck(String s) {
	    int count = 0;
	    int carry = 0;
	    for (int i = s.length() - 1; i > 0; i--) {
	    	int val=s.charAt(i) - '0';
	        if (val + carry == 1) {
	            carry = 1;
	            count++;
	        }
	        count++;
	    }
	    return count + carry;
	}

}
