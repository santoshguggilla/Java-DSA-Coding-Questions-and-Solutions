package Java_Questions;

public class WordSearch {

	static int[][] d={{0,-1},{-1,0},{0,1},{1,0}};
	static int k=0;
	public static void main(String[] args) {
		char[][] board=   {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
		String word="ABCESEEEFS";
		System.out.println(exist(board, word));
	}
    public static boolean exist(char[][] board, String word) {
        if(word.length()==0) return true;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(word.charAt(0)==board[i][j]){
                    boolean[][] b=new boolean[board.length][board[i].length];
                    b[i][j]=true;
                    k=1;
                    method(i,j,board, b, word);
                     if(k==word.length()) {
                    	 return true;
                     }
                     
                }
            }
        }
        return false;
    }

    public static void method( int i, int j, char[][] board,boolean[][] b,String word){
        if(k==word.length()) {
        	return;
        }
        int count=0;

        for(int p=0;p<d.length;p++){
            int r=i+d[p][0];
            int c=j+d[p][1];
            if(r>=board.length || r<0 || c >= board[i].length || c<0){
                continue;
            }else if(!b[r][c] && k<word.length()&& board[r][c]== word.charAt(k)){
                k++;
                b[r][c]=true;
                count++;
                method( r, c, board, b, word);
                if(k==word.length()) {
                	return;
                }
               count=0;
            }
        }
        if(count==0) {        	
        	k--;
        	b[i][j]=false;
        } 
    }
}
