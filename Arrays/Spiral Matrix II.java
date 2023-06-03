class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int r=0,c=0,m=n-1,N=m,val=1;
        
        while( val <= Math.pow(n,2) ){
            
            for( int k=c; k<=N; k++){
                matrix[r][k] = val++;
            }
            r++;
        
            for( int k=r; k<=m; k++){
                matrix[k][N] = val++;
            }
            N--;
          
            for( int k=N; k>=c; k--){
                matrix[m][k] = val++;
            }
            m--;
           
            for( int k=m; k>=r; k--){
                matrix[k][c] = val++;
            }
            c++;
            
        }
        return matrix;
    }
}