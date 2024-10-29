package Java_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxDistance {
	
	public static void main(String[] args) {
		List<List<Integer>> arrays=new ArrayList<>();
		arrays.add(Arrays.asList(1));
		arrays.add(Arrays.asList(1));
	//	arrays.add(Arrays.asList(-2,-1,0,2));
		System.out.println(maxDistance(arrays));
	}

	    public static int maxDistance(List<List<Integer>> arrays) {
	        int ans=0;
	        int s=0,e=arrays.size()-1;
	        if(s==e) return 0;
	        while(s<arrays.size()){
	            int i=0,j=arrays.get(e).size()-1;
	            int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
	            if(s!=e) {
	                while(i<arrays.get(s).size()){
	                    if(max<arrays.get(s).get(i)){
	                        max=arrays.get(s).get(i);
	                    }
	                    i++;
	                }
	                while(j>=0){
	                    if(min>arrays.get(e).get(j)){
	                        min=arrays.get(e).get(j);
	                    }
	                    j--;
	                }
	                int val=Math.abs(min-max);
	                if(ans<val){
	                	ans=val;
	                }
	            }
	            if(e==0) {
	            	s++;
	            	e=arrays.size()-1;
	            }else {
	            	e--;
	            }
	           
	        }
	       
	        return ans;
	        
	    }
}
