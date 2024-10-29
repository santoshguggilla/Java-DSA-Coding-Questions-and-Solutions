package Java_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCombination {
	public static void main(String[] args) {
		int[] candidates= {10,1,2,7,6,1,5};
		int target=8;
		System.out.println(combinationSum2(candidates, target));
	}
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int index=0;
        Arrays.sort(candidates);
        method(index,candidates, target, new ArrayList<>(),ans);
        return ans;
    }

    public static void method(int index, int[] cand,int t,List<Integer> ds,List<List<Integer>> ans){
        if(t==0){
            ans.add(new ArrayList<>(ds));
            return;
            
        }

        for(int i=index;i<cand.length;i++){
            if(i>index && cand[i]==cand[i-1]) continue;
            if(cand[i]>t) break;
            ds.add(cand[i]);
            method(i+1,cand,t-cand[i],ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}
