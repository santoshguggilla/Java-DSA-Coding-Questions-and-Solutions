package Leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SlidingPuzzle {
	public static void main(String[] args) {
		int[][] board = {{1,2,3},{4,0,5}};
		System.out.println(slidingPuzzle(board));
	}
	public static int slidingPuzzle(int[][] board) {

		Queue<String> queue=new LinkedList<>();
        Set<String> visited=new HashSet<>();
        String ans="123450";   
        String curr= convertToString(board);
        int step=0;
        queue.offer(curr);
        visited.add(curr);
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!queue.isEmpty()){
        	int size = queue.size();
            for(int i=0;i<size;i++){
                String str=queue.poll();
                if(str.equals(ans)) return step;
                int zeroi=str.indexOf("0");
                int r=zeroi/3, c=zeroi%3;
                for(int[] d:dir){
                    int newr=r+d[0];
                    int newc=c+d[1];
                    if(newr>=0 && newr<2 && newc>=0 && newc<3){
                        int index=newr*3+newc;
                        String val=swap(str,zeroi, index);
                        if(!visited.contains(val)){
                            queue.offer(val);
                            visited.add(val);
                        }
                    }    
                }
            }
            step++;
        }
        return step;
    }
    public static String convertToString(int[][] b){
        String str="";
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                str+=String.valueOf(b[i][j]);
            }
        }
        return str;
    }
    public static String swap(String str, int z, int i){
        char[] ch=str.toCharArray();
        char temp= ch[z];
        ch[z]=ch[i];
        ch[i]=temp;
        return new String(ch);
    }
}
