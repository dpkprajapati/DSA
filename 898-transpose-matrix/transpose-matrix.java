class Solution {
    public int[][] transpose(int[][] matrix) {
       if(matrix.length ==0|| matrix == null){
            return new int[0][0];
       }
       int oldRows = matrix.length;
       int oldCols = matrix[0].length;
       int  newRows = oldCols;
       int newCols = oldRows;
       int ans[][] = new int[newRows][newCols];

       for(int i = 0;  i<oldRows ; i++){
            for (int j = 0 ; j<oldCols; j++){
                ans[j][i] = matrix[i][j];
            }
       }
       return ans;
    }
}