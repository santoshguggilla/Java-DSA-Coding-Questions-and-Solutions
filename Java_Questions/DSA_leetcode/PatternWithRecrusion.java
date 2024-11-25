package Java_Questions;

public class PatternWithRecrusion {

	public static void main(String[] args) {
		drawPattern1(0, 0,5);

		drawPattern2(0, 0, 5);
	}
	
	public static void drawPattern1(int i,int j, int t) {
		if(i==5) return;
		else if(j==t) {
			j=0;
			i++;
			System.out.println();
			drawPattern1(i, j, --t);
		}else {
			System.out.print("* ");
			
			drawPattern1(i, ++j,t);
		}
		
	}
	public static void drawPattern2(int i,int j, int s) {
		if(i==5) return;
		else if(j==5) {
			System.out.println();
			j=0;
			drawPattern2(++i, j, --s);
		}else if(j>=s) {
			System.out.print(" *");
			drawPattern2(i, ++j, s);
		}else {
			System.out.print("  ");
			drawPattern2(i, ++j,s);
		}
		
	}
}
