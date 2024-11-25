package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Unique_Number_of_Occurrences {
	public static void main(String[] args) {
		int[] arr=new int[] {26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
		System.out.println(uniqueOccurrences(arr));
	}
	public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int val:arr){
            hm.put(val, hm.getOrDefault(val,0)+1);
        }
        Stack<Integer> stack=new Stack<>();
        for(Map.Entry<Integer,Integer> value:hm.entrySet()){
            Integer val=value.getValue();
            if(!stack.isEmpty() && stack.contains(val))
             return false;
            stack.push(val);
        }
        return true;
    }
}
