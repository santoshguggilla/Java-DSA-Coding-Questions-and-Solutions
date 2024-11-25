package Leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream8Java {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,1,2,3,5,5,7,8,9);
		Set<Integer> l1=list.stream().collect(Collectors.toSet());
		
		Set<Integer> l2=list.stream().filter(n->Collections.frequency(list,n)>1).collect(Collectors.toSet());
		
		List l3=list.stream().filter(n->Collections.frequency(list,n)==1).collect(Collectors.toList());
		
		System.out.println(l1+" "+l2+" "+l3);
		
		
	}
}
