class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lt = new ArrayList<>();
        int r=0,c=0,m=matrix.length-1,n=matrix[0].length-1;
        
        while( true ){
            
            for( int k=c; k<=n; k++){
                lt.add(matrix[r][k]);
            }
            r++;
            if(r>m || c>n) break;
            for( int k=r; k<=m; k++){
                lt.add(matrix[k][n]);
            }
            n--;
            if(r>m || c>n) break;
            for( int k=n; k>=c; k--){
                lt.add(matrix[m][k]);
            }
            m--;
            if(r > m || c > n) break;
            for( int k=m; k>=r; k--){
                lt.add(matrix[k][c]);
            }
            c++;
            
        }
        
        return lt;
    }
}