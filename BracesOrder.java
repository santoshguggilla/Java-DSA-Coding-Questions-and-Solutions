package Java_Questions;

import java.util.Stack;

public class BracesOrder {
	
	public static void main(String[] args) {
		String str="{[](){}{}}";
		
		Stack<Character> stack=new Stack<>();
		for(char ch:str.toCharArray()) {
			switch(ch) {
			case '{' : stack.push('{');
			break;
			case'[' : stack.push('[');
			break;
			case'(' :stack.push('(');
			break;
			case'}':if(!stack.isEmpty()&& stack.peek()=='{') stack.pop();
					else stack.push('}');
			break;
			case']':if(!stack.isEmpty()&& stack.peek()=='[') stack.pop();
					else stack.push(']');
			
			break;
			case')':if(!stack.isEmpty()&& stack.peek()=='(') stack.pop();
					else stack.push(')');
			break;
			
			}
		}
		System.out.println(stack.isEmpty());
		
		
		//System.out.println(method(str));
	}
	public static boolean method(String str) {
		if(str.length()==0) {
			return true;
		}
		if(str.charAt(0) =='{' && str.charAt(str.length()-1)=='}'||str.charAt(0) =='(' && str.charAt(str.length()-1)==')'||str.charAt(0) =='[' && str.charAt(str.length()-1)==']') {
			return method(str.substring(1,str .length()-1));
		}
		return false;
	}

}
