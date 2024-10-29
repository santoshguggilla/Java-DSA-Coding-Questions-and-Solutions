package Java_Questions;

import java.util.ArrayList;

public class FractionAdditionSubtraction {

	public static void main(String[] args) {

		String expression ="7/3+5/2-3/10";
		System.out.println(fractionAddition(expression));
	}

	public static String fractionAddition(String expression) {
		
		 ArrayList<Integer> dlist=new ArrayList<>();
			ArrayList<Integer> nlist=new ArrayList<>();
			boolean isNeg=false;
			boolean isNum=true;
	        int count=0;
			for(int i=0;i<expression.length();i++) {
				if(expression.charAt(i)=='-') {
					isNeg=true;
	                
	                if(i!=0){
	                    count=2;
	                    if(isNum) isNum=false;
	                    else isNum=true;
	                }
				}else if(expression.charAt(i)=='+') {
					isNeg=false;
					if(isNum) isNum=false;
                    else isNum=true;
	                count=2;
				}else if(expression.charAt(i)=='/') {
	                count=2;
	                if(isNum) isNum=false;
                    else isNum=true;
				}else {
					if(isNum) {
	                    if(count==0 && nlist.size()!=0){
	                        int val=nlist.get(nlist.size()-1);
	                        nlist.remove(nlist.size()-1);
	                        val=val*10+Integer.valueOf(expression.charAt(i)+"");
	                        nlist.add(val);
	                    }else{
						    if(isNeg) {
							    nlist.add(Integer.valueOf(expression.charAt(i)+"")*-1);
						    }  else {
							    nlist.add(Integer.valueOf(expression.charAt(i)+""));
						    }
						    isNeg=false;
	                    }
	                    count=0;
	                    isNum=true;
					}else {
						if(count==1 && nlist.size()!=0) {
							int val=dlist.get(nlist.size()-1);
							dlist.remove(dlist.size()-1);
	                        val=val*10+Integer.valueOf(expression.charAt(i)+"");
	                        dlist.add(val);
						}else {							
							dlist.add(Integer.valueOf(expression.charAt(i)+""));
							isNum=false;
						}
						count=1;
					}
				}
			}
			int dem=lcm(dlist);
			int num=0;
			for(int i=0;i<dlist.size();i++) {
				int val=dem/dlist.get(i);
				num+=nlist.get(i)*val;
			}
			if(num==0) return "0/1";
			int i=2;
			while(i<10) {
				if(num%i==0 && dem%i==0) {			
					num/=i;
					dem/=i;
				}else {
					i++;
				}
				
			}
			System.out.println(nlist +"/ "+dlist);
			
			return num+"/"+dem;
		}

		public static int lcm(ArrayList<Integer> dlist) {
			  int result = dlist.get(0);
		        for (int i = 1; i < dlist.size(); i++) {
		            result = lcm(result, dlist.get(i));
		        }
		        return result;
		}

		public static int gcd(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return gcd(b, a % b);
	    }


	    public static int lcm(int a, int b) {
	        return (a * b) / gcd(a, b);
	    }
}
