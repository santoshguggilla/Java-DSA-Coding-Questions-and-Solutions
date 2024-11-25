package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class AppendCharactersString { 

	public static void main(String[] args) {
		String s="coaching";
		String t="coding";
		appendCharacters(s, t);
		Map<String, Integer> hm=new HashMap<>();
		
	
		
		String[] arr=new String[] {"a","b","c","a","b"};
		for(String str:arr) {
			hm.put(str, hm.getOrDefault(str, 0)+1);
		}
		System.out.println(hm);
		
	}
	public static int appendCharacters(String s, String t) {
        
        int i=0,j=0;
        int count=0;
        while(i<s.length() && j<t.length()){
            int a=(int)s.charAt(i);
            int b=(int)t.charAt(j);
            if(a>b){
                count++;
                j++;
            }else{
                i++;
            }
        }
        return count;
        
    }
}
