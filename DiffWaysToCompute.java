package Java_Questions;

import java.util.ArrayList;
import java.util.List;

public class DiffWaysToCompute {

    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (ch == '+' || ch == '-' || ch == '*') {
                List<Integer> s1 = diffWaysToCompute(expression.substring(0, i));
                List<Integer> s2 = diffWaysToCompute(expression.substring(i + 1));
                
                for (int a : s1) {
                    for (int b : s2) {
                        if (ch == '+') {
                            res.add(a + b);
                        } else if (ch == '-') {
                            res.add(a - b);
                        } else if (ch == '*') {
                            res.add(a * b);
                        }
                    }
                }
            }
        }
        
        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }
        
        return res;
    }

    public static void main(String[] args) {
        String str = "2*3-4*5";
        System.out.println(diffWaysToCompute(str));
    }
}
