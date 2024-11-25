package Leetcode;

import java.util.HashMap;

public class GoalParse {

	public static void main(String[] args) {
		String str="G()(al)";
		interpret(str);
	}
	
	public static String interpret(String command) {
        HashMap<String, String> hm=new HashMap<>();
        hm.put("()","o");
        hm.put("(al)","al");
        String s="";
        String ans="";
        for(char ch:command.toCharArray()){
            s+=ch+"";
            if(hm.containsKey(s)){
                ans+=hm.get(s);
                s="";
            }else if(s=="G"){
                ans+=s;
                s="";
            }
        }
        return ans;

    }
}
