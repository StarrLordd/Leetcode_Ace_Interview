class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int  i=0,j=0;
        while(i<matrix.length){
            if(matrix[i][j]==target) return true;
            j++;
            if(j==matrix[0].length){
                j=0;i++;
            }
        }
        return false;
    }
}