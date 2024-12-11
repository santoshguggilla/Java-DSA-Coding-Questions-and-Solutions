package Leetcode;

public class MovePieces {

	public static void main(String[] args) {
		String start = "_L__R__R_", target = "L______RR";
		System.out.println(canChange(start, target));
	}
	public static boolean canChange(String start, String target) {
		//if(1==1)return false;
		if (target == null || target.isEmpty())
			return true;
		if (start == null || start.isEmpty())
			return false;
		if (target.length() > start.length())
			return false;
		char[] ch1 = target.toCharArray();
		char[] ch2 = start.toCharArray();
		int i = ch1.length - 1, j = ch2.length - 1;
		int count=0;
        while(i>=0 && j>=0){
            if(ch1[i]=='_'){
                if(count>0){
                    i--;
                    count--;
                }else if(ch1[i]==ch2[j]){
                    i--;
                    j--;
                }else if(ch2[j]=='L' && j-1>=0 && ch2[j-1]=='_'){
                    i--;
                    j--;
                }
            }else{
                if(ch1[i]==ch2[j]){
                    i--;
                    j--;
                }else if(ch2[j]=='_'){
                    j--;
                    count++;
                }
            }
        }		
        return i == 0;
	}
}
