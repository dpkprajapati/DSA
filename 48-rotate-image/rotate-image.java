class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        for(int i =0 ;  i<m ; i++){
            for(int j= i+1 ; j<m ; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i =0 ; i<m; i++){
            int startNum = 0;
            int endNum = m-1;
            while(startNum<=endNum){
                int temp = matrix[i][startNum];
                matrix[i][startNum]= matrix[i][endNum];
                matrix[i][endNum]= temp;
                startNum++;
                endNum--;
            }
        }
    }
}