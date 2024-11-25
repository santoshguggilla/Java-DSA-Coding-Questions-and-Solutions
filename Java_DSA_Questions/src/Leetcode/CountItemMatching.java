package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountItemMatching {
	public static void main(String[] args) {
		List<List<String>> nestedList = new ArrayList<>();
        nestedList.add(List.of("phone", "blue", "pixel"));
        nestedList.add(List.of("computer", "silver", "lenovo"));
        nestedList.add(List.of("phone", "gold", "iphone"));
        String ruleKey = "color", ruleValue = "silver";
        countMatches(nestedList, ruleKey, ruleValue);
	}
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        if(ruleKey=="color"){
            for(List<String> list:items){
                if(ruleValue==list.get(1)){
                    count++;
                }
            }
        }else if(ruleKey =="type"){
            for(List<String> list:items){
                if(ruleValue==list.get(0)){
                    count++;
                }
            }
        }else if(ruleKey=="name"){
            for(List<String> list:items){
                if(ruleValue==list.get(2)){
                    count++;
                }
            }
        }
        return count;
    }
}
