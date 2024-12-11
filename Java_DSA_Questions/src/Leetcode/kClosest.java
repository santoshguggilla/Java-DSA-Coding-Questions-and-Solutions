package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class kClosest {
	public static int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        HashMap<Integer,Integer[]> map=new HashMap<>();
        for(int i=0;i<points.length;i++){
            int v1=points[i][0];
            int v2=points[i][1];
            int val=(int)(Math.pow(v1,2)+Math.pow(v2,2));
           map.put(val, new Integer[]{points[i][0], points[i][1]});
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int index=0;;
        int i=0;
        while(k!=0){
        	
        	for (int j = 0; j < 2; j++) {
        	    ans[i][j] = map.get(list.get(index))[j];
        	    
        	}
        	i++;
        	index++;
            k--;
        }
        return ans;
    }
	public static void main(String[] args) {
		int[][] points = {{3,3},{5,-1},{-2,4}};
		int k = 2;
		System.out.println(kClosest(points, k).toString());
	}
	
}
