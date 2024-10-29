package Java_Questions;

import java.util.Arrays;
import java.util.List;

public class MaxNumVowels {
	
	public static void main(String[] args) {
		String s="weallloveyou";
		int k=7;
		maxVowels(s, k);
	}
	
	public static int maxVowels(String s, int k) {
        List<Character> chlist=Arrays.asList('a','e','i','o','u');
        if(k>=s.length()) return 0;
        int j=k;
        int i=0;
        int max=0;
        while(j<=s.length() && i<s.length()){
            String tem=s.substring(i,j);
            int count=0;
            for(int t=0;t<tem.length();t++){
                if(chlist.contains(tem.charAt(t))){
                    count++;
                }
            }
            if(max<=count){
                max=count;
            }
            i++;
            j++;
        }

        return max;
    }

}
