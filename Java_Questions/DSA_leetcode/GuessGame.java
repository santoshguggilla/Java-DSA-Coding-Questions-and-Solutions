package Java_Questions;

public class GuessGame {
	
	public static void main(String[] args) {
		int n=2126753390;
		System.out.println(guessNumber(n));
	}
	
	 public static int guessNumber(int n) {
	        int s=1,e=n;
	        int m=s+(e-s)/2;
	        return method(s,e,m);
	    }
	    public static int method(int s,int e, int m){
	        int p=guess(m);
	        if(s>e) return m;
	        if(p==0) return m;
	        if(p==1){
	            s=m+1;
	            m=s+(e-s)/2;
	            return method(s,e,m);
	        }
	        else{
	            e=m;
	            m=s+(e-s)/2;
	            return method(s,e,m);
	        }
	    }
	    public static int guess(int p) {
	    	if(1702766719==p) {
	    		return 0;
	    	}else if(p<1702766719) {
	    		return 1;
	    	}else {
	    		return -1;
	    	}
	    }

}
