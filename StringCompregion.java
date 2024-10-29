package Java_Questions;

import java.util.HashMap;
import java.util.Map;

public class StringCompregion {
	
	public static void main(String[] args) {
		char[] a=new char[] {'a','a','b','b','c','c','c'};
		compress(a);
	}

	public static int compress(char[] chars) {
        HashMap<Character, Integer> mp=new HashMap<>();
        for(Character ch:chars){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int ans=0;
        for(Map.Entry<Character, Integer> en:mp.entrySet()){
            int count=en.getValue();
             ans += 1 + (count > 1 ? String.valueOf(count).length() : 0);
        }
        return ans;
    }
}
