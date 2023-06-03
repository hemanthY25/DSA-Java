class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length ==0|| board[0].length == 0) return false;
        for(int i =0; i < board.length; i++){
            for(int j =0; j < board[0].length;j++){
                if(check(0,i,j, board, word)) return true;
            }
        }
        return false;
    }
    public boolean check(int j, int r, int c, char[][] matrix, String word){
         if( j == word.length()) return true;
         if( r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length) return false;
        
        int[] dr = {0,1,0,-1}, dc={1,0,-1,0};
        if( matrix[r][c] == word.charAt(j)){
             char temp = matrix[r][c];
            matrix[r][c] = '*';
             for(int i=0; i<4; i++){
        //   if( dr[i]+r >=0 && dr[i]+r<matrix.length && dc[i]+c >=0 && dc[i]+c <matrix[0].length){
               if( check(j+1,dr[i]+r,dc[i]+c,matrix,word)) return true;
//}
}
            matrix[r][c] = temp;
        }
        return false;
}
}