package java8sessionn;

public class RegularExpression {

//        char[] ch1=s.toCharArray();
//        char[] ch2=p.toCharArray();
//        String ans="";
//         while(i<ch1.length && j<ch2.length) {
//        	 if(ch2[j]==ch1[i] || ch2[j]=='.') {
//        		 ans+=ch2[j]+"";
//        		 i++;
//        		 j++;
//        	 }else if(ch2[j]=='*'){
//        		 String str="";
//        		 while(s.contains(ans+str)) {
//        			 str+=ch2[j-1];
//        		 }
//        		 ans+=str.substring(1,str.length());
//        		 i=ans.length();
//        		 if(str.substring(1,str.length()).length()==0)
//        		 j+=str.length();
//        		 else
//        			 j+=str.length()-1;
//        	 }else{
//        		 j++;
//        		 
//        	 }
//        	 
//        	
//         

	    public static boolean isMatch(String s, String p) {
	        if (p.isEmpty()) return s.isEmpty();
	        boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

	        if (p.length() > 1 && p.charAt(1) == '*') {
	            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
	        } else {
	            return firstMatch && isMatch(s.substring(1), p.substring(1));
	        }
	    }


	public static void main(String[] args) {
		String s =
				"mississippi",
				p =
				"mis*is*ip*.";
		System.out.println(isMatch(s, p));
	}
}
