package Java_Questions;

import java.util.Stack;

public class MinLenStrAfterRemovingSubStr {
	    public static int minLength(String s) {
	        if(s.length()<=1) return s.length();
	        Stack<Character> st=new Stack<>();
	        for(int i=s.length()-1;i>=0;i--){
	            st.push(s.charAt(i));
	        }
	        int temp=s.length();
	        s="";
	        while(!st.isEmpty()){
	            char ch=st.pop();
	            if(!st.isEmpty()&&((ch=='A' && st.peek()=='B')|| (ch=='C' && st.peek()=='D'))){
	                st.pop();
	            }else{
	                s+=ch+"";
	            }
	            if(st.isEmpty() && temp==s.length()){
	                return s.length();
	            }else if(st.isEmpty()){
	                for(int i=s.length()-1;i>=0;i--){
	                    st.push(s.charAt(i));
	                }
	                temp=s.length();
	                s="";
	            }
	        }
	        return s.length();
	    }
	    public static void main(String[] args) {
			String str="ABFCACDB";
			System.out.println(minLength(str));
		}
	
}
