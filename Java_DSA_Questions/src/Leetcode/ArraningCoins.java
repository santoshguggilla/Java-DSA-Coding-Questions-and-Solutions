package Leetcode;

public class ArraningCoins {
	public static int arrangeCoins(int n) {
        return method(0,n,1);
    }

    public static int method(int count,int n, int k){
        if(k>n) return count;
        if(k==n) return ++count;
        return method(++count,n-k,++k);
    }
    
    public static void main(String[] args) {
		int n=10;
		arrangeCoins(n);
	}

}
