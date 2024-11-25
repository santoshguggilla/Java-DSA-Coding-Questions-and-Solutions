package Leetcode;

public class ListPalindromeString {
	public static void main(String[] args) {
		String str="abbasannasanthoshsohtnas";
		int max=0;
		String longStr="";
		for(int i=0;i<str.length();i++) {
			String s=str.charAt(i)+"";
			
			char ch=str.charAt(i);
			for(int j=i+1;j<str.length();j++) {
				s+=str.charAt(j)+"";
				if(s.length()>1 && ch==str.charAt(j) && isPaindrome(s)) {
					System.out.println(s);
				}
				if(s.length()>1 && ch==str.charAt(j) && max<s.length() && isPaindrome(s)) {
					max=s.length();
					longStr=s;
				}
			}
		}
		System.out.println("Longest Sub String :"+longStr);
	}
	public static boolean isPaindrome(String s) {
		if(s.length()==0 || s.length()==1) {
			return true;
		}
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			return isPaindrome(s.substring(1,s.length()-1));
		}
		return false;
	}

}
