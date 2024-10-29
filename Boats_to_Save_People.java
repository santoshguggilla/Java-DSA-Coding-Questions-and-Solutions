package Java_Questions;

public class Boats_to_Save_People {
	public static void main(String[] args) {
		int[] people=new int[] {1,2};
		int limit=3;
		boolean[] b=new boolean[people.length];
        for(int i=0;i<people.length;i++){
           int max=0;
           int j=0;
           int i1=i;
           int i2=j;
           while(j<people.length){
                if(j!=i && !b[i] && !b[j]){
                    int val=people[i]+people[j];
                    if(val<=limit && max<val){
                        max=val;
                        i1=i;
                        i2=j;
                    }
                }
                j++;
           }
           if(max==0 && people[i]<=limit && !b[i]){
            b[i]=true;
           }
           if(max>0){
            b[i1]=true;
            b[i2]=true;
           } 

        }
	}
}
