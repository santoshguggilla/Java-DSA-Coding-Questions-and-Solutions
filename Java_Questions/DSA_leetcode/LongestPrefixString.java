package Java_Questions;

public class LongestPrefixString {
	
	public static void main(String[] args) {

		String[] a= {"pawan","pavan","panel","payny"};
		int n=a.length;
		String ans="";
		for(int i=0;i<a[0].length();i++) {
			int count=0;
			String s=a[0].charAt(i)+"";
			for(int j=0;j<n;j++) {
				if(i<a[j].length()&& s.equals(a[j].charAt(i)+"")) {
					count++;
				}
			}
			if(count==n) {
				ans+=s;
			}else {
				System.out.println(ans);
				return;
			}
		}
	}

}
