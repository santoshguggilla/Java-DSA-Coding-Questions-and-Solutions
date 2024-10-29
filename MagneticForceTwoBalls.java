package Java_Questions;

public class MagneticForceTwoBalls {
	
	public static void main(String[] args) {
		int[] p= {1,2,3,4,5,6,7,8,9,10};
		int m=4;
		System.out.println(maxDistance(p, m));
	}
	public static int maxDistance(int[] position, int m) {
		long max=0;
	    long min=position[0];
        for(int i=0;i<position.length;i++){
            max=Math.max(max,position[i]);
            min=Math.min(min,position[i]);
        }
        if(m==2) return (int)(max-min);
        long ans=max/m;
        if(max%m==0) ans+=1;
        return (int)(ans);
    }
}
