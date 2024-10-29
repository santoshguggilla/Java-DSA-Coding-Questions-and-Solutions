package Java_Questions;

import java.util.Arrays;
import java.util.HashMap;

public class MaxScoreWords {

	public static void main(String[] args) {
		String[] words =new String[] {"baaa","aacc","ccbc","da","dbbc"}; 
		char[] ch = {'a','a','a','c','c','c','c','c','d','d','d'};
		int[] score = {9,4,10,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		maxScoreWords(words, ch, score);
	}
	public static int maxScoreWords(String[] words, char[] letters, int[] score) {
        Arrays.sort(letters);
        HashMap<Character, Integer> hm = new HashMap<>();
        int j=0;
        for(int i=0;i<score.length && j<letters.length;i++){
            if(score[i]!=0){
            	char ch=letters[j];
                hm.put(ch,hm.getOrDefault(ch,score[i])); 
                j++;
                while(j<letters.length &&ch==letters[j]) j++;
            }
        }
        int fmax=0;
        for(int h=0;h<words.length;h++){
            boolean[] b=new boolean[letters.length];
            int max=0;
            for(int i=h;i<words.length;i++){
            	String str=words[i];
            	int sum=0;
            	boolean[] t=new boolean[str.length()];
                for(int m=0;m<str.length();m++){
                    for(int l=0;l<letters.length;l++){
                        if(str.charAt(m)==letters[l] && !b[l]){
                            if(hm.containsKey(str.charAt(m))){
                                sum+=hm.get(str.charAt(m));
                                b[l]=true;
                                t[m]=true;
                            }
                            break;
                        }
                    }
                
                }
                boolean s=false;
                for(int m=0;m<t.length;m++) {
                	if(!t[m]) {
                		s=true;
                	}
                }
                if(!s) max+=sum;

            }
            if(fmax<max){
                fmax=max;
            }
        }
        return fmax;

    }
}
