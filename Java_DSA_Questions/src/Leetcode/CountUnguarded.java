package Leetcode;

public class CountUnguarded {

	static int[][] d={{-1,0},{1,0},{0,-1},{0,1}};
    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] arr=new int[m][n];
        for(int i=0;i<guards.length;i++){
            arr[guards[i][0]][guards[i][1]]=1;
        }
         for(int i=0;i<walls.length;i++){
            arr[walls[i][0]][walls[i][1]]=-1;
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    method(arr, i,j);
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void method(int[][] arr,int i, int j){
        
        for(int k=0;k<d.length;k++){
            int r=i+d[k][0];
            int c=j+d[k][1];
            while( r>=0 && c>=0 && r<arr.length && c< arr[0].length && arr[r][c]!=-1 ){
            	if(arr[r][c]==1) break;
                arr[r][c]=2;
                r=r+d[k][0];
                c=c+d[k][1];
            }

        }
    }
	
	public static void main(String[] args) {
		int m = 6, n = 10;
		int[][] guards = {{0,6},{2,2},{2,5},{1,2},{4,9},{2,9},{5,6},{4,6}}, walls = {{1,5}};
		System.out.println(countUnguarded(m, n, guards, walls));
		
	}

}
